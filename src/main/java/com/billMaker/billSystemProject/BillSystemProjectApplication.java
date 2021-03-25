package com.billMaker.billSystemProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"/billSystemProject/src/main/java/com/billMaker/billSystemProject/Controller/Controller.java"})

public class BillSystemProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillSystemProjectApplication.class, args);
	}
	
	@Bean
    public WebMvcConfigurer corsConfigurer() 
    {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("https://my-bill-system.herokuapp.com");
            }
        };
    }

}
