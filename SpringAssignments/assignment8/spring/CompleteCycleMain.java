package com.assignment8.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.assignment9.spring.AppConfig;
import com.assignment9.spring.HelloWorld;

public class CompleteCycleMain {
	public static void main(String[] args) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		context.registerShutdownHook();
		HelloWorld obj=(HelloWorld)context.getBean("hello");
		obj.setName("vicky");
		obj.print();
	}
}
