package com.example.test.DingdingRobaot.service.impl;

import com.example.test.DingdingRobaot.service.DingdingService;
import okhttp3.*;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;

@Service
public class DingDingServiceImpl implements DingdingService {

    private Logger logger = LoggerFactory.getLogger(DingDingServiceImpl.class);

    @Value("${dingding.secret}")
    private String secret;

    @Value("${dingding.url}")
    private String url;

    @Override
    public String sign(Long timeStamp) {
        try {
            String stringToSign = timeStamp + "\n" + secret;
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
            byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
            String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8");
            return sign;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public String getUrl() {
        Long timestamp = System.currentTimeMillis();
        String finalUrl = url + "&timestamp=" + timestamp + "&sign=" + sign(timestamp);
        logger.info("finalUrl:{}", finalUrl);
        return finalUrl;
    }

    @Override
    public String sendDingdingMsg(String msg) {
        try {
            MediaType JSON = MediaType.parse("application/json;charset=utf-8");
            OkHttpClient okHttpClient= new OkHttpClient();
            RequestBody requestBody = RequestBody.create(JSON, msg);

            Request request = new Request.Builder()
                    .url(getUrl())
                    .post(requestBody)
                    .build();

            Response response = okHttpClient.newCall(request).execute();
            String resp = response.body().string();
            logger.info("resp:{}", resp);
            return resp;
        }catch (Exception e){
            return null;
        }

    }
}
