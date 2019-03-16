package com.honor.ssm.controller;

import com.honor.ssm.entity.Admin;
import com.honor.ssm.entity.User;
import com.honor.ssm.entity.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用来测试spring mvc数据绑定
 * Created by 戴天赐 on 2019/3/16.
 */
@Controller
@RequestMapping("/user")
public class ModelController {

    /**
     * 参数必须传，int为基础类型
     *
     * @param age
     * @return
     */
    @RequestMapping("/age")
    @ResponseBody
    public String getAge(int age) {
        return "age:" + age;
    }

    /**
     * 参数可以不传，integer为包类型
     *
     * @param age
     * @return
     */
    @RequestMapping("/age1")
    @ResponseBody
    public String getAge1(Integer age) {
        return "age:" + age;
    }

    /**
     * 可以设置别名，可以设置参数的默认值
     *
     * @param age
     * @return
     */
    @RequestMapping("/age2")
    @ResponseBody
    public String getAge2(@RequestParam(value = "age", required = true, defaultValue = "2") int age) {
        return "age:" + age;
    }

    /**
     * http://localhost:8080/ssm/user/age3/6
     * 路径变量的写法
     *
     * @param age
     * @return
     */
    @RequestMapping("/age3/{age}")
    @ResponseBody
    public String getAge3(@PathVariable(value = "age") int age) {
        return "age:" + age;
    }

    /**
     * http://localhost:8080/ssm/user/user?name=a&age=10&userInfo.phone=10086&userInfo.address=aaa
     * 参数接收多层级对象，例如属性里也有实体
     *
     * @param user
     * @return
     */
    @RequestMapping("/user")
    @ResponseBody
    public String getUser(User user) {
        return user.toString();
    }

    /**
     * 参数实体里面有相同的属性，但是要分开接收，需要设置webDataBinder
     * 没有添加注解，user.name写法参数接收不到
     * http://localhost:8080/ssm/user/users?user.name=a&user.age=10&admin.name=b&admin.age=11
     *
     * @param user
     * @param admin
     * @return
     */
    @RequestMapping("/users")
    @ResponseBody
    public String getUserAndAUser(User user, Admin admin) {
        return user.toString() + admin.toString();
    }


    /**
     * user为参数名
     *
     * @param webDataBinder
     */
    @InitBinder("user")
    public void initUser(WebDataBinder webDataBinder) {
        webDataBinder.setFieldDefaultPrefix("user.");
    }

    /**
     * aUser为参数名
     *
     * @param webDataBinder
     */
    @InitBinder("admin")
    public void initAUser(WebDataBinder webDataBinder) {
        webDataBinder.setFieldDefaultPrefix("admin.");
    }

//    ****************************************数组集合相关***************************************

    /**
     * http://localhost:8080/ssm/user/name?name=a&name=b&name=c
     * 参数接收数组
     *
     * @param name
     * @return
     */
    @RequestMapping("/array")
    @ResponseBody
    public String getNames(String[] name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : name) {
            stringBuilder.append(s).append(",");
        }
        return stringBuilder.toString();
    }

    /**
     * 推荐方法
     * testUserList.html
     * 这里采用前端json格式化的办法 此处参数前面需要添加 @RequestBody 否则无法接收
     * 页面的数组参数的传递有两种办法
     * 1、设置UserForm方式接收参数
     * 2、在页面时候把数据json格式化（推荐方法）
     *
     * @param users
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<User> getUsers(@RequestBody List<User> users) {
        return users;
    }

    /**
     * testUserList01.html
     * 这里采用前端form格式化的办法,将集合定义成一个form实体接收，表单对应的字段name需要更好
     * 例如users[0].name
     * 请求的索引一定要连续，否则会有bug
     * 页面的数组参数的传递有两种办法
     * 1、设置UserForm方式接收参数
     * 2、在页面时候把数据json格式化
     *
     * @param userForm
     * @return
     */
    @RequestMapping("/listform")
    @ResponseBody
    public UserForm getUsersByform(UserForm userForm) {
        return userForm;
    }
}
