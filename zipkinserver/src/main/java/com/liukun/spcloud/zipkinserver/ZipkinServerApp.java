package com.liukun.spcloud.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created by liukun on 2017/4/6.
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApp.class,args);
    }
}
