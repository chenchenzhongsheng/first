package com.example.demo.test.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018\1\29 0029.
 */

@RestController
public class HelloWorld {
    @RequestMapping("/heloword")

        public String home(){
            return "helloword";
    }



}
