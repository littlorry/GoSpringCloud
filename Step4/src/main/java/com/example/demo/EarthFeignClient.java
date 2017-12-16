package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ajiao on 2017/12/8.
 */
@FeignClient(name="step3")
public interface EarthFeignClient {
    @RequestMapping("/show")
    public String GetInfo();
}
