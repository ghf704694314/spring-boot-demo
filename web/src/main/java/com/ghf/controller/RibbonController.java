//package com.ghf.controller;
//
//import com.ghf.impl.config.RibbonConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * com.ghf.controller
// *
// * @Author : Gaohf
// * @Description :
// * @Date : 2017/11/23
// */
//@RestController
//@ResponseBody
//public class RibbonController {
//
//    private static final String URL = "http://users";
//
//    @Autowired
//    private RibbonConfig ribbonConfig;
//
//    @RequestMapping(value = "/ribbon")
//    public String ribbon() {
//        String result=ribbonConfig.restTemplate().getForObject(RibbonController.URL, String.class);
//        return result;
//    }
//}
