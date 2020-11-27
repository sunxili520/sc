package com.kyoxue.service;

import com.kyoxue.entity.Product;

import java.util.List;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue.service
 * @date 2020/11/27
 */
public interface IProductService {
    public List<Product> list()throws Exception;
}
