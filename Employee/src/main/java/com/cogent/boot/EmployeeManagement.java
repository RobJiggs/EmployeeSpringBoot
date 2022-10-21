package com.cogent.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeManagement {

	public static void main(String[] args) {
	//ApplicationContext ctx=	
		SpringApplication.run(EmployeeManagement.class, args);
		System.out.println("hey");
	}

}
