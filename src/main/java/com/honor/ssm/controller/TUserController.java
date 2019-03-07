package com.honor.ssm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honor.ssm.entity.TUser;
import com.honor.ssm.mapper.TUserMapper;
import com.honor.ssm.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author daitianci
 * @since 2019-03-07
 */
@Controller
@RequestMapping("/")
public class TUserController {
    @Resource
    ITUserService userService;

    @GetMapping("/listUser")
    @ResponseBody
    public IPage listUser(Integer page, Integer rows) {
        //创建分页page对象
        IPage<TUser> iPage = new Page<>(page, rows);
        //创建过滤对象
        QueryWrapper<TUser> condition = new QueryWrapper<>();
//        condition.like("username","ad");

        IPage<TUser> resoult = userService.page(iPage,condition);

        return resoult;
    }

    @GetMapping("/customListUser")
    @ResponseBody
    public IPage customListUser(Integer page, Integer rows) {
        return userService.customPage(page,rows);
    }
}
