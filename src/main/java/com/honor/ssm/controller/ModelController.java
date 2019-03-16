package com.honor.ssm.controller;

import com.honor.ssm.entity.Admin;
import com.honor.ssm.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**用来测试spring mvc数据绑定
 * Created by 戴天赐 on 2019/3/16.
 */
@Controller
@RequestMapping("/user")
public class ModelController {

    /**
     * 参数必须传，int为基础类型
     * @param age
     * @return
     */
    @RequestMapping("/age")
    @ResponseBody
    public String getAge(int age){
        return "age:" + age;
    }

    /**
     * 参数可以不传，integer为包类型
     * @param age
     * @return
     */
    @RequestMapping("/age1")
    @ResponseBody
    public String getAge1(Integer age){
        return "age:" + age;
    }

    /**
     * 可以设置别名，可以设置参数的默认值
     * @param age
     * @return
     */
    @RequestMapping("/age2")
    @ResponseBody
    public String getAge2(@RequestParam(value="age", required=true, defaultValue="2") int age){
        return "age:" + age;
    }

    /**
     * http://localhost:8080/ssm/user/age3/6
     * 路径变量的写法
     * @param age
     * @return
     */
    @RequestMapping("/age3/{age}")
    @ResponseBody
    public String getAge3( @PathVariable(value="age") int age){
        return "age:" + age;
    }

    /**
     *http://localhost:8080/ssm/user/user?name=a&age=10&userInfo.phone=10086&userInfo.address=aaa
     * 参数接收多层级对象，例如属性里也有实体
     * @param user
     * @return
     */
    @RequestMapping("/user")
    @ResponseBody
    public String getUser(User user){
        return user.toString();
    }

    /**
     * 参数实体里面有相同的属性，但是要分开接收，需要设置webDataBinder
     * 没有添加注解，user.name写法参数接收不到
     * http://localhost:8080/ssm/user/users?user.name=a&user.age=10&admin.name=b&admin.age=11
     * @param user
     * @param admin
     * @return
     */
    @RequestMapping("/users")
    @ResponseBody
    public String getUserAndAUser(User user, Admin admin){
        return user.toString() + admin.toString();
    }


    /**
     * user为参数名
     * @param webDataBinder
     */
    @InitBinder("user")
    public void initUser(WebDataBinder webDataBinder){
        webDataBinder.setFieldDefaultPrefix("user.");
    }

    /**
     * aUser为参数名
     * @param webDataBinder
     */
    @InitBinder("admin")
    public void initAUser(WebDataBinder webDataBinder){
        webDataBinder.setFieldDefaultPrefix("admin.");
    }

//    ****************************************数组集合相关***************************************

    /**
     * http://localhost:8080/ssm/user/name?name=a&name=b&name=c
     * 参数接收数组
     * @param name
     * @return
     */
    @RequestMapping("/name")
    @ResponseBody
    public String getNames(String[] name){
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : name) {
            stringBuilder.append(s).append(",");
        }
        return stringBuilder.toString();
    }
}
