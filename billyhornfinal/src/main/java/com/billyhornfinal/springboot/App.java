package com.billyhornfinal.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 *
 */

@SpringBootApplication
@ComponentScan(basePackages="com.billyhornfinal.services")
@EntityScan(basePackages="com.billyhornfinal.services")
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class);
    }
    
    @Bean
	public EmbeddedServletContainerFactory tomcatContainerFactory() {
	   return new TomcatEmbeddedServletContainerFactory();
	}
}
