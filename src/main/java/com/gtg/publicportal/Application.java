package com.gtg.publicportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//@EnableWebMvc
//@EnableAutoConfiguration


/*@ComponentScan(basePackages = { 
		"com.gtg.publicportal",
		"com.gtg.publicportal.config",
		"com.gtg.publicportal.service",
		"com.gtg.publicportal.controller"
})*/

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
