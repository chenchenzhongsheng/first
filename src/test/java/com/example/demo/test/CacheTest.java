package com.example.demo.test;

import com.example.demo.test.dao.MybatisOneMapper;
import com.example.demo.test.model.MybatisOne;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018\2\2 0002.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(DemoApplication.class)
@SpringBootTest(classes = DemoApplication.class)
public class CacheTest {
    @Autowired
    private MybatisOneMapper mybatisOneMapper;

    private static final Log log = LogFactory.getLog(com.example.demo.test.DemoApplicationTests.class);
//    @Before
//    public void before() {
//        MybatisOne mybatisOne=new MybatisOne();
//        mybatisOne.setId(16L);
//        mybatisOne.setmName("李");
//        mybatisOne.setmAge(1111111111);
//        mybatisOneMapper.insert(mybatisOne);
//    }
    @Test
    public void test() throws Exception {
          MybatisOne mybatisOne1=mybatisOneMapper.selectByPrimaryKey(15L);

        System.out.println("第一次查询：" + mybatisOne1.getmAge());

        MybatisOne mybatisOne2=mybatisOneMapper.selectByPrimaryKey(15L);

        System.out.println("第2次查询：" + mybatisOne2.getmAge());

        mybatisOne1.setmAge(20);

        MybatisOne mybatisOne3=mybatisOneMapper.selectByPrimaryKey(15L);
        System.out.println("第三次查询：" + mybatisOne3.getmAge());

    }



}
