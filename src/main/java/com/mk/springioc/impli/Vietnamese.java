package com.mk.springioc.impli;

import com.mk.springioc.lang.Language;

public class Vietnamese implements Language{
	// Vietnamese
	
	   @Override
	   public String getGreeting() {
	       return "Xin Chao";
	   }

	   @Override
	   public String getBye() {
	       return "Tam Biet";
	   }


}
