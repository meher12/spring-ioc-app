package com.mk.springioc.impli;

import com.mk.springioc.lang.Language;

public class English implements Language{
	
	@Override
	 public String getGreeting() {
	     return "Hello";
	 }

	 @Override
	 public String getBye() {
	     return "Bye bye";
	 }


}
