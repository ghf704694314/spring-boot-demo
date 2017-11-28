package com.ghf.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * com.ghf.controller
 *
 * @Author : Gaohf
 * @Description :
 * @Date : 2017/11/23
 */
@RestController
public class BaseController {

    private final Logger logger=Logger.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/")
    public String index(){
        ServiceInstance instance=discoveryClient.getLocalServiceInstance();
        logger.info("/hello,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return "index";
    }

}
