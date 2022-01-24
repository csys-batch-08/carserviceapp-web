package com.carserviceapp.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarCustomer 
{
  private String name;
  private long mobileno;
  private String password; 
  private String email;
  private String address;
  private int user_id;
  
public String getName() {
	return name;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public void setName(String name) {
	this.name = name;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public CarCustomer( String name, long mobileno, String password, String email,
		String address) {
	super();
	//this.usertype = usertype;
	this.name = name;
	this.mobileno = mobileno;
	this.password = password;
	this.email = email;
	this.address = address;
}
public CarCustomer() {
	super();
	// TODO Auto-generated constructor stub
}

public CarCustomer(int user_id,String password)
{
	super();
	this.password = password;
	this.user_id = user_id;
}


public CarCustomer(long mobileno,String password)
{
	super();
	this.password = password;
	this.mobileno = mobileno;
}

public CarCustomer(long mobileno,String email,String dummy)
{
	super();
	this.mobileno = mobileno;
	this.email = email;
}

public CarCustomer(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}
public CarCustomer(String name, long mobileno, String email, String address, int user_id) {
	super();
	this.name = name;
	this.mobileno = mobileno;
	this.email = email;
	this.address = address;
	this.user_id = user_id;
}
public CarCustomer(long mobileno) {
	super();
	this.mobileno = mobileno;
}

public CarCustomer(String username)
{
	this.name=name;
}

@Override
public String toString() {
	return "Customer \n name=" + name + "\n mobileno=" + mobileno + "\n email=" + email
			+ "\n address=" + address + "\n"+user_id+"\n\n";
}
  
}
