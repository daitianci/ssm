package com.honor.ssm.entity;

//import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by 戴天赐 on 2019/3/1.
 */
public class User {
    private String userName;
    private String password;
    //spring mvc controller中接受日期参数需要指定格式转化
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //jackson输出json中日期的格式转换，需要指定时区
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    //FastJson的json中日期的格式转换设置方式，不需要设置时区
    //@JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    private double salary;

    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
