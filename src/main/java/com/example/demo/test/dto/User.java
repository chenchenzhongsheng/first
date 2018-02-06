package com.example.demo.test.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



/**
 * Created by Administrator on 2018\1\30 0030.
 */

@Entity

public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    private String name;
    @Column(nullable = false)
    private String sex;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
   private Long tel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", tel=" + tel +
                '}';
    }
}
