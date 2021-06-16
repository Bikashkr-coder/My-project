package org.vicky.springproj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Autowired
	private Address customerAddress;
String customerName;
int customerId,customerContact;

public String getCustomerName() {
	return "Vicky";
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public Address getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(Address customerAddress) {
	this.customerAddress = customerAddress;
}

public int getCustomerId() {
	return 519835;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getCustomerContact() {
	return 012345;
}
public void setCustomerContact(int customerContact) {
	this.customerContact = customerContact;
}
public void customerDetails() {
	System.out.println("Customer ID is =" + getCustomerId());
	System.out.println("Customer Name is =" + getCustomerName());
	System.out.println("Customer Contact Number is =" + getCustomerContact());
	System.out.println("Address of the Customer is =" + customerAddress.getCity()+ " " + customerAddress.getCountry()+ " " + customerAddress.getPin() +" " +customerAddress.getState() + " " +getCustomerAddress().getStreet());
	//System.out.println(Address.getCity());
}
}
