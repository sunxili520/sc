package com.kyoxue.api.impl;

import com.kyoxue.api.IProductApi;
import com.kyoxue.entity.Product;
import com.kyoxue.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue.api.impl
 * @date 2020/11/29
 */
@Service
public class ProductService implements IProductApi{

    @Autowired
    private IProductService productService;

    @Override
    public List<Product> getProducts() throws Exception {
        return productService.list();
    }
}
