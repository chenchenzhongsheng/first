package com.example.demo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018\2\1 0001.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class RedisTest {

     //   @Autowired
    //    StringRedisTemplate stringRedisTemplate;
    @Test
    public void test() throws Exception {

        // 保存字符串
     //   stringRedisTemplate.opsForValue().set("aaa", "111");
    //    String aaa=stringRedisTemplate.opsForValue().get("aaa");
    //    Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
     //   System.out.println(aaa);
    }

}
