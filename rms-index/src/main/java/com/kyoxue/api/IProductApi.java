package com.kyoxue.api;

import com.kyoxue.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue.api
 * @date 2020/11/29
 */
@FeignClient(name = "RMS-PRODUCT")
public interface IProductApi {

    @GetMapping("/product/list")
    public List<Product> getProducts()throws Exception;
}
