package com.mk.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mk.springioc.bean.GreetingService;
import com.mk.springioc.bean.MyComponent;
import com.mk.springioc.config.AppConfiguration;
import com.mk.springioc.lang.Language;

@SpringBootApplication
public class SpringCoreIoCApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreIoCApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		   System.out.println("----------");
	       Language language = (Language) context.getBean("language");
	     
	       System.out.println("Bean Language: "+ language);
	       System.out.println("Call language.sayBye(): "+ language.getBye());
	     
	       System.out.println("----------");
	     
	       GreetingService service = (GreetingService) context.getBean("greetingService");
	 

	       service.sayGreeting();
	 
	       System.out.println("----------");
	     
	       MyComponent myComponent = (MyComponent) context.getBean("myComponent");
	     
	       myComponent.showAppInfo();
		
	}

}
