package com.mk.springioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.springioc.lang.Language;

@Service
public class GreetingService {
	
	@Autowired
	private Language language;

	public GreetingService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void sayGreeting() {
		String greeting = this.language.getGreeting();
		System.out.println("Greeting: " + greeting);
	}
	
	

}
