package com.example.test.DingdingRobaot.service;

public interface DingdingService {

    String sign(Long timeStamp);

    String getUrl();

    String sendDingdingMsg(String msg);
}
