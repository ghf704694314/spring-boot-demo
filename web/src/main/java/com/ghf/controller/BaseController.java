package com.ghf.controller;

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

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

}
