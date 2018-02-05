package com.example.demo.test;

//import BlogProperties;
//import HelloWorld;
//
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.test.SpringApplicationConfiguration;
////import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockServletContext;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
////import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import javax.swing.*;
//
//import static org.hamcrest.Matchers.equalTo;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



//@RunWith(SpringRunner.class)
//@SpringBootTest

//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MockServletContext.class)
//@WebAppConfiguration
//
//public class DemoApplicationTests {
//	private MockMvc mvc;
//
//	@Before
//	public void setMvc() throws Exception {
//		mvc = MockMvcBuilders.standaloneSetup(new HelloWorld()).build();
//	}
//
//	@Test
//	public void contextLoads() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/heloword").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("helloword")));
//
//
//	}
//}

import com.example.demo.test.service.BlogProperties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(DemoApplication.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

	private static final Log log = LogFactory.getLog(DemoApplicationTests.class);
	@Autowired
	private BlogProperties blogProperties;


@Test
	public  void TestHello()throws Exception {
	Assert.assertEquals("程序猿", blogProperties.getName());


}
}