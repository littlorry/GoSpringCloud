package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ajiao on 2017/12/7.
 */

@RestController
public class EarthController {
    @GetMapping("/show")
    public String GetInfo(){
        return "yes";
    }
}
