package com.kyoxue.service.impl;

import com.kyoxue.entity.Product;
import com.kyoxue.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue.service.impl
 * @date 2020/11/27
 */
@Slf4j
@Service
public class ProductServiceImpl implements IProductService{

    @Value("${server.port}")
    private String serverPort;
    @Override
    public List<Product> list() throws Exception {
        log.info(serverPort);
        List<Product> list = new ArrayList<>(0);
        list.add(new Product(1l,"这是第一个商品...",new BigDecimal(100)));
        list.add(new Product(2l,"这是第二个商品...",new BigDecimal(89)));
        return list;
    }
}
