package com.ghf.web;

import com.ghf.impl.service.UserService;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan
@EnableJpaRepositories
@SpringBootApplication
public class DemoApplication {

	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public void HelloWorld(){
		userService.findById("1");
	}

	@Bean
	@Primary
	@ConfigurationProperties(prefix="datasource.primary")
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test2?characterEncoding=utf-8");
		ds.setUsername("gaohaifeng");
		ds.setPassword("123456");

		ds.setTestWhileIdle(true);
		ds.setTestOnBorrow(true);
		ds.setTestOnReturn(true);
		ds.setValidationQuery("SELECT 1");

		return ds;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}
