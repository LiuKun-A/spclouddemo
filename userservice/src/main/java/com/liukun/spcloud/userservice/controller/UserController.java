package com.liukun.spcloud.userservice.controller;

import com.liukun.spcloud.model.User;
import com.liukun.spcloud.userservice.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liukun on 2017/4/4.
 */
@Api(value = "user manager", description = "this is a test demo")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "获取所有用户接口",notes = "这是一个获取用户列表的接口，哈哈")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> listUser() {
        return userService.listUser();
    }
}
