package com.honor.ssm.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**用来测试spring mvc数据绑定
 * Created by 戴天赐 on 2019/3/16.
 */
@XmlRootElement(name="admin")
public class Admin {
    private String name;
    private Integer age;

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "age")
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
