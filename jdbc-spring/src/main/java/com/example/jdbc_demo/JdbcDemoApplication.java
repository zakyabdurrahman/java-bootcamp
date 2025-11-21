package com.example.jdbc_demo;

import com.example.jdbc_demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcDemoApplication.class, args);
        StudentService service = context.getBean(StudentService.class);
	}

}
