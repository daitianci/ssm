package com.honor.ssm.controller;

import com.honor.ssm.entity.User;
import com.honor.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 戴天赐 on 2019/2/28.
 */
@Controller
@RequestMapping("/")
public class RegistController {
    @PostMapping("/registUser")
    @ResponseBody
    public User registUser(User user) {
        return user;
    }

    /**
     * 使用 路径变量 接收参数
     *
     * @param word
     * @return
     */
    @GetMapping("/h/{word}")
    @ResponseBody
    public String hello(@PathVariable("word") String word) {
        return "succeed";
    }

    @Resource
    UserService userService;


    @GetMapping("/editUser/{userName}")
    public ModelAndView editUser(@PathVariable("userName") String userName) {
        User user = userService.selectUserByName(userName);
        ModelAndView modelAndView = new ModelAndView("/editUser");
        List<User> students = userService.listUsers();
        modelAndView.addObject("user", user);
        modelAndView.addObject("students", students);
        return modelAndView;
    }

    @GetMapping("/listUsers")
    @ResponseBody
    public List<User> listUsers() {
        return userService.listUsers();
    }
}
