package com.weber.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by weber on 16-10-13.
 */
@FeignClient("service-add")
public interface AddFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam Integer a, @RequestParam Integer b);
}
