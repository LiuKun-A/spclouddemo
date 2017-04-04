package com.liukun.spcloud.userservice.controller;

import com.liukun.spcloud.model.User;
import com.liukun.spcloud.userservice.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liukun on 2017/4/4.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> listUser() {
        return userService.listUser();
    }
}
