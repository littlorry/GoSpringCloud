package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ajiao on 2017/12/5.
 */
@RestController
public class DemoController {
    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/info")
    public DemoInfo GetInfo(){
        DemoInfo info = new DemoInfo();


        info.setName(name);

        return info;
    }
}
