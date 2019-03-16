package com.honor.ssm.entity;

/**
 * 用来测试spring mvc数据绑定
 * Created by 戴天赐 on 2019/3/16.
 */
public class UserInfo {
    private String phone;
    private String address;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
