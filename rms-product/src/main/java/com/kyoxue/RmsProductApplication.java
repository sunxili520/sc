package com.kyoxue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue
 * @date 2020/11/27
 */
@SpringBootApplication
@EnableEurekaClient//打开eureka注册客户端
public class RmsProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(RmsProductApplication.class,args);
    }
}
