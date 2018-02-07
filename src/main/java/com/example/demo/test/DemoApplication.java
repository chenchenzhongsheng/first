package com.example.demo.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching(proxyTargetClass = true) // 开启缓存功能
//@MapperScan("com.example.demo.test.dao")
public class DemoApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(this.getClass());
		return super.configure(builder);
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
