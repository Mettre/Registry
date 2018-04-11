package com.ywing.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author prince.cao
 * @date 2017/2/17.13:14
 * @description:
 */
@EnableEurekaServer
@SpringBootApplication
public class YwingRegistryCenter {

    public static void main(String[] args) {
        SpringApplication.run(YwingRegistryCenter.class, args);
    }

}
