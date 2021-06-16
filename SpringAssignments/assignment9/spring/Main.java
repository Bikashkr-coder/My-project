package com.assignment9.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.vicky.springproj.Customer;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		context.registerShutdownHook();
		HelloWorld obj=(HelloWorld)context.getBean("hello");
		obj.setName("vicky");
		obj.print();
	}
}
