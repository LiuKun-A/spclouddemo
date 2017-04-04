package com.liukun.spcloud.userservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by liukun on 2017/4/4.
 */
@Configuration
@EnableSwagger2
public class MyConfig {

    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo").genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select().apis(RequestHandlerSelectors.basePackage("com.liukun.spcloud.userservice"))
                .build().apiInfo(demoApiInfo());
    }
    //创建Api的基本信息，这些信息会展示在文档页面中
    private ApiInfo demoApiInfo() {
        Contact contact = new Contact("liukun","https://github.com/LiuKun-A/spclouddemo","lk@tet.com");
        ApiInfo apiInfo = new ApiInfo("Spring Boot中使用Swagger2构建RESTful APIs",
                "这是一个demo测试",
                "1.0",
                "NO terms of service",
                contact,
                "The Apache License, Version 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0.html");
        return apiInfo;
    }
}
