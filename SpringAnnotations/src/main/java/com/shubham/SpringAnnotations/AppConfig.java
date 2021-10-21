package com.shubham.SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public Processor getProcessor() {
		return new Snapdragon();
	}

}
