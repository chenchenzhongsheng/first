package com.example.demo.test.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018\1\30 0030.
 */

@Entity
public class UserNew {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String Username;
    @Column(nullable = false)
    private String sex;
    @Column(nullable = false)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserNew{" +
                "id=" + id +
                ", Username='" + Username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
