package com.assignment10.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AwareMain {
public static void main(String[] args) {
	AbstractApplicationContext context=new AnnotationConfigApplicationContext(AwareCode.class);
	AwareCode obj=(AwareCode)context.getBean("awarecode");
	obj.setName("vicky");
	obj.print();
}
}
