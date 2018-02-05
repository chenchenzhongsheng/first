package com.example.demo.test.model;

import java.io.Serializable;

public class MybatisOne implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private String mName;

    private Integer mAge;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmAge() {
        return mAge;
    }

    public void setmAge(Integer mAge) {
        this.mAge = mAge;
    }

    @Override
    public String toString() {
        return "MybatisOne{" +
                "id=" + id +
                ", mName='" + mName + '\'' +
                ", mAge=" + mAge +
                '}';
    }
}