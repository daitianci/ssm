package com.honor.ssm.entity;

import java.util.List;

/**用来测试spring mvc数据绑定
 * Created by 戴天赐 on 2019/3/16.
 */
public class User {
    private String name;
    private Integer age;
    private UserInfo userInfo;
    private List<UserInfo> infos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<UserInfo> getInfos() {
        return infos;
    }

    public void setInfos(List<UserInfo> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userInfo=" + userInfo +
                ", infos=" + infos +
                '}';
    }
}
