package com.kyoxue.controller;

import com.kyoxue.api.IProductApi;
import com.kyoxue.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

    @Autowired
    private IProductApi productApi;
//    private final static String PRODUCT_URL = "http://RMS-PRODUCT/product/list";
    @RequestMapping("show")
    @ResponseBody
    public List<Product> show(){
        try {
            return productApi.getProducts();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
//        return restTemplate.getForObject(PRODUCT_URL, String.class);
    }
}
