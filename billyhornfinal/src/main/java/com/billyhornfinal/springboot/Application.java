package com.billyhornfinal.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
 
	/**
	 * The default runner for a Spring Boot application
	 * 
	 * @param args these are run parameters
	 */
	public static void main(String[] args) {  
		SpringApplication.run(Application.class, args);
	}

}
