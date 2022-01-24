package com.carserviceapp.model;

import java.util.Date;

public class CarPayment 
{

private int bill_num;
private long card_no;
private String cardhol_name;
private Date expiry_date;
private int cvv_no;
private int amt_paid;
private int payment_id;
public int getBill_num() {
	return bill_num;
}
public void setBill_num(int bill_num) {
	this.bill_num = bill_num;
}
public long getCard_no() {
	return card_no;
}
public void setCard_no(long card_no) {
	this.card_no = card_no;
}
public String getCardhol_name() {
	return cardhol_name;
}
public void setCardhol_name(String cardhol_name) {
	this.cardhol_name = cardhol_name;
}
public Date getExpiry_date() {
	return expiry_date;
}
public void setExpiry_date(Date expiry_date) {
	this.expiry_date = expiry_date;
}
public int getCvv_no() {
	return cvv_no;
}
public void setCvv_no(int cvv_no) {
	this.cvv_no = cvv_no;
}
public int getAmt_paid() {
	return amt_paid;
}
public void setAmt_paid(int amt_paid) {
	this.amt_paid = amt_paid;
}
public int getPayment_id() {
	return payment_id;
}
public void setPayment_id(int payment_id) {
	this.payment_id = payment_id;
}
public CarPayment(int bill_num, long card_no, String cardhol_name, Date expiry_date, int cvv_no, int amt_paid) {
	super();
	this.bill_num = bill_num;
	this.card_no = card_no;
	this.cardhol_name = cardhol_name;
	this.expiry_date = expiry_date;
	this.cvv_no = cvv_no;
	this.amt_paid = amt_paid;
}
public CarPayment() {
	super();
	// TODO Auto-generated constructor stub
}
}
