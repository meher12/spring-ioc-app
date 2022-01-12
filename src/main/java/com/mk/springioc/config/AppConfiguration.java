package com.mk.springioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mk.springioc.impli.Vietnamese;
import com.mk.springioc.lang.Language;

@Configuration
@ComponentScan("com.mk.springioc.bean")
public class AppConfiguration {
	
	@Bean(name = "language")
	public Language getLanguage() {
		
		return new Vietnamese();
		
	}

}
