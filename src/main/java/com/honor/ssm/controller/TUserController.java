package com.honor.ssm.controller;

import com.honor.ssm.entity.TUser;
import com.honor.ssm.entity.User;
import com.honor.ssm.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author daitianci
 * @since 2019-03-27
 */
@Controller
@RequestMapping("//tUser")
public class TUserController {
    @Autowired
    ITUserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public TUser addUser(){
        TUser user = new TUser();
        user.setNickname("小天");
        user.setUsername("daitianci");
        user.setPassword("123");
        userService.saveNew(user);
        return user;
    }
}
