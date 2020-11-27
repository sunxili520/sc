package com.kyoxue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue.controller
 * @date 2020/11/27
 */
@RestController
@RequestMapping("index")
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    private final static String PRODUCT_URL = "http://RMS-PRODUCT/product/list";
    @RequestMapping("show")
    @ResponseBody
    public String show(){
        return restTemplate.getForObject(PRODUCT_URL, String.class);
    }
}
