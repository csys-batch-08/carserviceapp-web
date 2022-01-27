package com.carserviceapp.model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class BillDetails
{
private int bill_num;
private int user_id;
private LocalDate serv_date;
private int amount;
private String status;
DateTimeFormatter formatter =
DateTimeFormatter.ofPattern("dd-MM-yyyy");
public int getBill_num() {
	return bill_num;
}
public void setBill_num(int bill_num) {
	this.bill_num = bill_num;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getServ_date()
{
	return serv_date.format(formatter);
}
public void setServ_date(LocalDate serv_date) {
	this.serv_date = serv_date;
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
//public billDetails(int user_id) {
//	super();
//	this.user_id = user_id;
//}

//for insert
public BillDetails(int user_id, LocalDate servdate,int amount) {
	super();
	this.bill_num = bill_num;
	this.user_id = user_id;
	this.serv_date = servdate;
	this.amount = amount;
}


//for user bill
public BillDetails(int bill_num, LocalDate serv_date, int amount, String status) {
	super();
	this.bill_num = bill_num;
	this.serv_date = serv_date;
	this.amount = amount;
	this.status = status;
}
//for admin
public BillDetails(int bill_num, int user_id, LocalDate serv_date, int amount, String status) {
	super();
	this.bill_num = bill_num;
	this.user_id = user_id;
	this.serv_date = serv_date;
	this.amount = amount;
	this.status = status;
}

//for pay
public BillDetails(int user_id) {
	super();
	this.user_id = user_id;
}

//public billDetails(int bill_num) {
//	super();
//	this.bill_num = bill_num;
//}
//for update bill
public BillDetails(int bill_num, int amount) {
	super();
	this.bill_num = bill_num;
	this.amount = amount;
}
public BillDetails(int user_id,int bill_num,String dummy)
{
	super();
	this.user_id=user_id;
	this.bill_num=bill_num;	
}

@Override
public String toString() {
	return "billDetails \n bill_num=" + bill_num + "\n user_id=" + user_id +"\n serv_date=" + serv_date + "\n amount=" + amount+"\n status="+status+"\n\n";
}


}
