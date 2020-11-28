package com.kyoxue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue
 * @date 2020/11/27
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class RmsIndexApplication {
    public static void main(String[] args) {
        SpringApplication.run(RmsIndexApplication.class,args);
    }
}
