package com.lz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private HelloWold helloWold;

    @RequestMapping("/GO")
    public String say() {
        return helloWold.say();
    }
}
