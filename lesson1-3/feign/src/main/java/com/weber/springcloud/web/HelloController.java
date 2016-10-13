package com.weber.springcloud.web;

import com.weber.springcloud.feign.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloFeignClient client;

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String hello() {
        return client.hello();
    }

}