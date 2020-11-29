package com.kyoxue.api;

import com.kyoxue.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue.api
 * @date 2020/11/29
 */
@FeignClient(name = "RMS-PRODUCT",fallback = IProductApi._productHystrixCallback.class)
public interface IProductApi {

    @GetMapping("/product/list")
    public List<Product> getProducts()throws Exception;

    //注意必须申明为spring管理的类
    //这个内部类是熔断后的回调类，用来对坏掉的服务做补充，比如可以记录日志，返回默认数据，执行默认功能能。
    //定义完内部类，需要在FeignClient注解中设置fallback=这个回调类，见上面
    @Component
    @Slf4j
    static class _productHystrixCallback implements IProductApi{

        @Override
        public List<Product> getProducts() throws Exception {
            //可以在被调服务中人为睡1秒，就会熔断判断执行到这里（hystrix默认超时是1秒，建议不修改这个时间，高并发1秒已经很长了，设置过长容易宕机）
            log.info("被调服务超时或已停掉，这里是默认的callback方案...");
            return new ArrayList<>(0);
        }
    }
}
