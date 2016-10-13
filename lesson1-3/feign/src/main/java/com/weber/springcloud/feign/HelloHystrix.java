package com.weber.springcloud.feign;

import org.springframework.stereotype.Component;

/**
 * Created by weber on 16-10-13.
 */
@Component
public class HelloHystrix implements HelloFeignClient {

    @Override
    public String hello() {
        return "error";
    }
}
