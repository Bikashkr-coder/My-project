package com.assignment9.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component(value = "hello" )
public class HelloWorld implements InitializingBean,DisposableBean {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("InitializationBean init method called for HelloWorld");
}
public void print() {
	System.out.println("Hello "+getName());
}

@Override
public void destroy() throws Exception {
	System.out.println("DisposableBean destroy method called for HelloWorld");
	
}
}
