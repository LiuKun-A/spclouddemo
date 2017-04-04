package com.liukun.spcloud.userservice.service;

import com.liukun.spcloud.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liukun on 2017/4/4.
 */
@Service
public class UserService {

    public List<User> listUser() {
        List<User> result = new ArrayList<>();
        User user1 = new User(1L,"张三","12345678901","shanghai");
        User user2 = new User(2L,"李四","12345678901","shanghai");
        User user3 = new User(3L,"王五","12345678901","shanghai");
        result.add(user1);
        result.add(user2);
        result.add(user3);
        return result;
    }
}
