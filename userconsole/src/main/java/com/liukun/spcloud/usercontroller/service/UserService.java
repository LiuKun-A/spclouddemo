package com.liukun.spcloud.usercontroller.service;

import com.alibaba.fastjson.JSON;
import com.liukun.spcloud.model.User;
import com.liukun.spcloud.usercontroller.proxy.UserRemoteService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liukun on 2017/4/4.
 */
@Service
public class UserService {
//    @Resource
//    private RestTemplate restTemplate;

    @Resource
    private UserRemoteService userRemoteService;

    @HystrixCommand(fallbackMethod = "listRollback")
    public List<User> getUser() {
        List<User> result = null;
//        ResponseEntity<String> entity = restTemplate.getForEntity("http://USER-SERVICE/user/list",String.class);
//        result = JSON.parseArray(entity.getBody(),User.class);
        result = userRemoteService.listUser();
        return result;
    }

    public List<User> listRollback() {
        System.out.println("error ..");
        return null;
    }
}
