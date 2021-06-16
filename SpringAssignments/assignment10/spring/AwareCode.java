package com.assignment10.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component(value = "awarecode")
public class AwareCode implements ApplicationContextAware {
private String name;
private ApplicationContext context=null;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public void setApplicationContext(ApplicationContext context) throws BeansException {
	this.context=context;
}

public void print() {
	System.out.println("Hello "+getName());
}

}
