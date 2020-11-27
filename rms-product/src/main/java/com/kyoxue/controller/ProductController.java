package com.kyoxue.controller;

import com.kyoxue.entity.Product;
import com.kyoxue.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue.controller
 * @date 2020/11/27
 */
@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("list")
    public List<Product> list(){
        try {
            return productService.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
