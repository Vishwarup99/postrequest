package com.springboot.first.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringbootLearning1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearning1Application.class, args);
	}

}
