package com.carserviceapp.model;

public class CarCustomer 
{
  private String name;
  private long mobileNo;
  private String password; 
  private String email;
  private String address;
  private int userId;
  private String userType;
  
public String getName() {
	return name;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public void setName(String name) {
	this.name = name;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
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
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public CarCustomer( int userId,String name, long mobileNo, String password, String email,
		String address) {
	super();
	this.userId=userId;
	this.name = name;
	this.mobileNo = mobileNo;
	this.password = password;
	this.email = email;
	this.address = address;
}
public CarCustomer() 
{
	super();
}

public CarCustomer(int userId,String password)
{
	super();
	this.password = password;
	this.userId = userId;
}


public CarCustomer(long mobileNo,String password)
{
	super();
	this.password = password;
	this.mobileNo = mobileNo;
}

public CarCustomer(long mobileNo,String email,String dummy)
{
	super();
	this.mobileNo = mobileNo;
	this.email = email;
}

public CarCustomer(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}
public CarCustomer(String name, long mobileNo, String email, String address, int userId) {
	super();
	this.name = name;
	this.mobileNo = mobileNo;
	this.email = email;
	this.address = address;
	this.userId = userId;
}

public CarCustomer(String name, long mobileNo, String password, String email, String address) {
	super();
	this.name = name;
	this.mobileNo = mobileNo;
	this.password = password;
	this.email = email;
	this.address = address;
}
public CarCustomer(long mobileNo) {
	super();
	this.mobileNo = mobileNo;
}

public CarCustomer(String name)
{
	this.name=name;
}

@Override
public String toString() {
	return "Customer \n name=" + name + "\n mobileno=" + mobileNo + "\n email=" + email
			+ "\n address=" + address + "\n"+userId+"\n\n";
}
  
}
