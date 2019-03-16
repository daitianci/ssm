package com.honor.ssm.entity;

import java.util.List;

/**
 * Created by 戴天赐 on 2019/3/16.
 */
public class UserForm {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "users=" + users +
                '}';
    }
}
