package com.lz;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloWorldServiceImpl implements HelloWold {
    public String say() {
        return "Hello World !";
    }
}
