package com.weber.springcloud.auth.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: wangbei
 * Date: 2016/10/14
 * Time: 17:04
 * Desc:
 */
@RestController
public class LoginController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String login() {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/login, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "Login successfully, Welcome!";
    }
}
