package com.honor.ssm.service;

import com.honor.ssm.entity.User;

import java.util.List;

/**
 * Created by 戴天赐 on 2019/3/1.
 */
public interface UserService {
    User selectUserByName(String userName);

    List<User> listUsers();
}
