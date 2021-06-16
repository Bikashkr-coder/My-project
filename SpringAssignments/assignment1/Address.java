package org.vicky.springproj;

import org.springframework.stereotype.Component;

@Component
public class Address {
String street,city,state,country;
int pin;


public String getStreet() {
	return "govindpur";
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return "Jamshedpur";
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return "Jharkhand";
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return "India";
}
public void setCountry(String country) {
	this.country = country;
}
public int getPin() {
	return 831015;
}
public void setPin(int pin) {
	this.pin = pin;
}
}
