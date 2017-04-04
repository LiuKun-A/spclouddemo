package com.liukun.spcloud.usercontroller.proxy;

import com.liukun.spcloud.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by liukun on 2017/4/4.
 */
@FeignClient(name = "USER-SERVICE")
public interface UserRemoteService {

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    List<User> listUser();
}
