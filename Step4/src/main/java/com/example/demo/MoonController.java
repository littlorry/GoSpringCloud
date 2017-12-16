package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ajiao on 2017/12/7.
 */

@RestController
@RequestMapping("xx")
public class MoonController {
    @Autowired
    private DiscoveryClient discovery;

    @Autowired
    private EarthFeignClient earth;

    @Autowired
    private NodeFeignClient node;

    @GetMapping("/getshow")
    public String GetInfo(){
        return "Come from earth:" + earth.GetInfo();
    }

    @GetMapping("/getnode")
    public String GetNode(){
        return node.Signin();
    }

    @GetMapping("/instance")
    public ServiceInstance GetInstance(){
        ServiceInstance instance = discovery.getInstances("step4").get(0);
        return instance;
    }

}
