package com.honor.ssm.service.impl;

import com.honor.ssm.entity.User;
import com.honor.ssm.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 戴天赐 on 2019/3/1.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User selectUserByName(String userName) {
        if ("daitc".equals(userName)) {
            User user = new User();
            user.setBirthday(new Date());
            user.setUserName(userName);
            user.setPassword("123");
            user.setSalary(1500);
            return user;
        } else {
            return null;
        }
    }

    @Override
    public List<User> listUsers() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setUserName("ZhangSan");
        user1.setBirthday(new Date());

        User user2 = new User();
        user2.setUserName("LiSi");
        user2.setBirthday(new Date());

        users.add(user1);
        users.add(user2);
        return users;
    }
}
