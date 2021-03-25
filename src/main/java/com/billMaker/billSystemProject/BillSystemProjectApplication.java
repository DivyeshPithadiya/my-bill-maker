package com.billMaker.billSystemProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@ComponentScan(basePackages={"/billSystemProject/src/main/java/com/billMaker/billSystemProject/Controller/Controller.java"})
public class BillSystemProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillSystemProjectApplication.class, args);
	}
	
//	@EnableWebSecurity
//	@Configuration
//	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	  @Bean
//	  @Override
//	  protected void configure(HttpSecurity http) throws Exception {
//	    http.csrf().disable();
//	  }
//	}

}
