package com.liukun.spcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by liukun on 2017/4/4.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakaServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(EurakaServiceApp.class,args);
    }
}
