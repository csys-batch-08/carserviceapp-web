package com.carserviceapp.model;

import java.util.Date;

public class CarPayment 
{

private int billNum;
private long cardNo;
private String cardholName;
private Date expiryDate;
private int cvvNo;
private int amtPaid;
private int paymentId;
public int getBillNum() {
	return billNum;
}
public void setBillNum(int billNum) {
	this.billNum = billNum;
}
public long getCardNo() {
	return cardNo;
}
public void setCardNo(long cardNo) {
	this.cardNo = cardNo;
}
public String getCardholName() {
	return cardholName;
}
public void setCardholName(String cardholName) {
	this.cardholName = cardholName;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}
public int getCvvNo() {
	return cvvNo;
}
public void setCvvNo(int cvvNo) {
	this.cvvNo = cvvNo;
}
public int getAmtPaid() {
	return amtPaid;
}
public void setAmtPaid(int amtPaid) {
	this.amtPaid = amtPaid;
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public CarPayment(int billNum, long cardNo, String cardholName, Date expiryDate, int cvvNo, int amtPaid) {
	super();
	this.billNum = billNum;
	this.cardNo = cardNo;
	this.cardholName = cardholName;
	this.expiryDate = expiryDate;
	this.cvvNo = cvvNo;
	this.amtPaid = amtPaid;
}
public CarPayment() {
	super();
}
}
