package com.carserviceapp.model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class BillDetails
{
private int billNum;
private int userId;
private LocalDate servDate;
private int amount;
private String status;
DateTimeFormatter formatter =
DateTimeFormatter.ofPattern("dd-MM-yyyy");
public int getBillNum() {
	return billNum;
}
public void setBillNum(int billNum) {
	this.billNum = billNum;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getServDate()
{
	return servDate.format(formatter);
}
public void setServDate(LocalDate servDate) {
	this.servDate = servDate;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public BillDetails() {
	super();
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

//for insert
public BillDetails(int userId, LocalDate servDate,int amount) {
	super();
	this.userId = userId;
	this.servDate = servDate;
	this.amount = amount;
}


//for user bill
public BillDetails(int billNum, LocalDate servDate, int amount, String status) {
	super();
	this.billNum = billNum;
	this.servDate = servDate;
	this.amount = amount;
	this.status = status;
}
//for admin
public BillDetails(int billNum, int userId, LocalDate servDate, int amount, String status) {
	super();
	this.billNum = billNum;
	this.userId = userId;
	this.servDate = servDate;
	this.amount = amount;
	this.status = status;
}

//for pay
public BillDetails(int userId) {
	super();
	this.userId = userId;
}

//for update bill
public BillDetails(int billNum, int amount) {
	super();
	this.billNum = billNum;
	this.amount = amount;
}
public BillDetails(int userId,int billNum,String dummy)
{
	super();
	this.userId=userId;
	this.billNum=billNum;	
}

@Override
public String toString() {
	return "billDetails \n bill_num=" + billNum + "\n user_id=" + userId +"\n serv_date=" + servDate + "\n amount=" + amount+"\n status="+status+"\n\n";
}


}
