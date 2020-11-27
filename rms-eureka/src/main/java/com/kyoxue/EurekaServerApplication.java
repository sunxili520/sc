package com.kyoxue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author admin
 * @version 1.0
 * @description com.kyoxue
 * @date 2020/11/27
 */
@SpringBootApplication
@EnableEurekaServer//重要：打开注册中心开关
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
