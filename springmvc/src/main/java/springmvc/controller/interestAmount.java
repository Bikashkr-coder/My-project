package springmvc.controller;

public class interestAmount {
private int amount;
private int rate;
private int years;
private float amt;
//private TotalAmount totalAmount;



public float getAmt() {
	return amt;
}
public void setAmt(float amt) {
	this.amt = amt;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public int getYears() {
	return years;
}
public void setYears(int years) {
	this.years = years;
}

double totalAmount ;



public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = amount*rate*years;
}








}
