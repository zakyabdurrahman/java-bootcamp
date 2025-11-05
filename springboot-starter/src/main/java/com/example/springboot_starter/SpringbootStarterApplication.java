package com.example.springboot_starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootStarterApplication {

	public static void main(String[] args) {
        //the context is this easy out of the box
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootStarterApplication.class, args);
        //get a bean/object from the spring (default singleton/dependency injection)
        MachineGun mg = context.getBean(MachineGun.class);
        mg.fire();
	}

}
