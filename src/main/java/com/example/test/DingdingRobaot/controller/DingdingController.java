package com.example.test.DingdingRobaot.controller;

import com.alibaba.fastjson.JSON;
import com.example.test.DingdingRobaot.common.DingDingMsg;
import com.example.test.DingdingRobaot.common.GitlabMsg;
import com.example.test.DingdingRobaot.service.DingdingService;
import org.apache.commons.codec.binary.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

@RestController
@RequestMapping(value = "/v1", produces = "application/json")
public class DingdingController {

    private Logger logger = LoggerFactory.getLogger(DingdingController.class);

    private static final String RUNNING = "running";
    private static final String PENDING = "pending";
    private static final String SUCCESS = "success";
    private static final String FAILED = "failed";

    @Autowired
    DingdingService dingdingService;

    @PostMapping("/data")
    public String SendDingDingMsg(@RequestBody String data) {

        logger.info("data:{}", data);

        GitlabMsg gitlabMsg = JSON.parseObject(data, GitlabMsg.class);
        if (!StringUtils.equals(gitlabMsg.getObject_kind(), "pipeline")) {
            return "not pipeline msg";
        }

        GitlabMsg.ProjectBean project = gitlabMsg.getProject();
        String projectName = project.getName();
        String projectWebUrl = project.getWeb_url();

        GitlabMsg.CommitBean commit = gitlabMsg.getCommit();
        String commitMessage = commit.getMessage();
        String commitId = commit.getId().substring(0,8);
        String commitUrl = commit.getUrl();

        GitlabMsg.ObjectAttributesBean objectAttributes = gitlabMsg.getObject_attributes();
        String objectAttributesRef = objectAttributes.getRef();
        String branchUrl = projectWebUrl + "/tree/" + objectAttributesRef;
        String status = objectAttributes.getStatus();
        String created_at = objectAttributes.getCreated_at();
        int id = objectAttributes.getId();
        String pipelineWebUrl = projectWebUrl + "/-/pipelines/" + id;

        //List<GitlabMsg.BuildsBean> builds = gitlabMsg.getBuilds();
        //GitlabMsg.BuildsBean buildsBean = builds.get(0);
        //String status = buildsBean.getStatus();

        if (StringUtils.equals(RUNNING, status) || StringUtils.equals(PENDING, status)){
            return "";
        }

        if (StringUtils.equals(status, SUCCESS)){
            status = "??????";
        }else if (StringUtils.equals(status, FAILED)){
            status = "??????";
        }

        GitlabMsg.UserBean user = gitlabMsg.getUser();
        String email = user.getEmail();

        DingDingMsg dingDingMsg = new DingDingMsg();
        dingDingMsg.setMsgtype("actionCard");
        DingDingMsg.ActionCardBean actionCardBean = new DingDingMsg.ActionCardBean();
        dingDingMsg.setActionCard(actionCardBean);
        actionCardBean.setTitle("${project}???${branch}?????????????????????`");
        String text =  "\n > ### ----????????????----\n" +
        "\n **????????????**: ["+ projectName + "](" + projectWebUrl +")\n" +
        "\n **????????????**: " + commitMessage + " \n" +
        "\n **??????commitID**: ["+ commitId +"](" + commitUrl + ")" + " \n" +
        "\n **????????????**: [" + objectAttributesRef + "](" + branchUrl + ")" + " \n" +
        "\n **????????????**: ["+ objectAttributesRef + "]("+ pipelineWebUrl + ")" + " \n" +
        "\n **????????????**: " + status + " \n" +
        "\n **????????????**: " + UTCToCST(created_at) + " \n" +
        "\n **?????????**: *"+ email +"*" + " \n" +
//        "\n **?????????**: *"+ "xxxx@ddddd.com" +"*" + " \n" +
//        "${githubTrendStr}" + " \n" +
//        "\n ![picture](${imgUrl})" + " \n" +
        "\n";
        actionCardBean.setText(text);
        actionCardBean.setBtnOrientation("0");
        ArrayList<DingDingMsg.ActionCardBean.BtnsBean> btnsBeans = new ArrayList<>(1);
        actionCardBean.setBtns(btnsBeans);
        DingDingMsg.ActionCardBean.BtnsBean btnsBean = new DingDingMsg.ActionCardBean.BtnsBean();
        btnsBeans.add(btnsBean);
        btnsBean.setTitle("????????????");
        btnsBean.setActionURL(commitUrl);

        String str = JSON.toJSONString(dingDingMsg);
        logger.info(str);

        String s = dingdingService.sendDingdingMsg(str);
        logger.info(s);

        return s;
    }

    public String UTCToCST(String UTCStr) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //????????????UTC
            df.setTimeZone(TimeZone.getTimeZone("UTC"));
            //?????????????????????????????????
            Date after = df.parse(UTCStr);
            System.out.println(after);
            df.applyPattern("yyyy-MM-dd HH:mm:ss");
            //????????????
            df.setTimeZone(TimeZone.getDefault());
            String finalStr = df.format(after);
            System.out.println(finalStr);
            return finalStr;
        }catch (Exception e){
            return null;
        }

    }
}
