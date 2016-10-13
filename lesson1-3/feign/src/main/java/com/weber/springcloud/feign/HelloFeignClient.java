package com.weber.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by weber on 16-10-13.
 */
@FeignClient(value = "service-hello", fallback = HelloHystrix.class)
public interface HelloFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}
