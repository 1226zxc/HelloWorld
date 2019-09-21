package com.lz;

import com.alibaba.dubbo.config.annotation.Reference;

@org.springframework.stereotype.Service
public class Service {
    @Reference(version = "1.0.0")
    private HelloWold helloWold;

    public String getResult() {
        return helloWold.say();
    }
}
