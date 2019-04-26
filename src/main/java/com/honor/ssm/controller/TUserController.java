package com.honor.ssm.controller;

import com.honor.ssm.entity.TUser;
import com.honor.ssm.service.ITUserService;
import com.honor.ssm.webservice.Greeting;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
        user.setStatus(1);
        userService.saveNew(user);
        return user;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public TUser getUser(){
        return userService.getByIdNew(33);
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public TUser updateser(){
        TUser user = userService.getByIdNew(33);
        user.setNickname("daitiancihonor");
        return userService.updateByIdNew(user);
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(){
        return userService.deleteByIdNew(36);
    }

    @RequestMapping("/listUser")
    @ResponseBody
    public List<TUser> listUsers(){
        List<TUser> tUsers = userService.listNew();
        return tUsers;
    }
}
