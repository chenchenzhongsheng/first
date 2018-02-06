package com.example.demo.test.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018\1\29 0029.
 */

@Component
public class BlogProperties {
@Value("${com.example.blog.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
