package com.honor.ssm.entity;

/**用来测试spring mvc数据绑定
 * Created by 戴天赐 on 2019/3/16.
 */
public class Admin {
    private String name;
    private Integer age;

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

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
