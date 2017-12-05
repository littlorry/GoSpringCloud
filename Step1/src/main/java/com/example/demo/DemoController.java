package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ajiao on 2017/12/5.
 */
@RestController
public class DemoController {

    @GetMapping("/info")
    public DemoInfo GetInfo(){
        DemoInfo info = new DemoInfo();
        info.setName("hello");

        return info;
    }
}
