package com.carserviceapp.model;

public class CarPickUp 
{
private int user_id;
private String c_name;
private String c_email;
private long c_mobile;
private String pick_address;
private int center_id;
private int pickup_id;
private String status;

public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public String getC_email() {
	return c_email;
}
public void setC_email(String c_email) {
	this.c_email = c_email;
}
public long getC_mobile() {
	return c_mobile;
}
public void setC_mobile(long c_mobile) {
	this.c_mobile = c_mobile;
}
public String getPick_address() {
	return pick_address;
}
public void setPick_address(String pick_address) {
	this.pick_address = pick_address;
}

public int getCenter_id() {
	return center_id;
}
public void setCenter_id(int center_id) {
	this.center_id = center_id;
}
public int getPickup_id() {
	return pickup_id;
}
public void setPickup_id(int pickup_id) {
	this.pickup_id = pickup_id;
}
public CarPickUp() {
	super();
	// TODO Auto-generated constructor stub
}


public CarPickUp(int user_id,String c_name, String c_email, long c_mobile, String pick_address, int center_id) {
	super();
	this.user_id = user_id;
	this.c_name = c_name;
	this.c_email = c_email;
	this.c_mobile = c_mobile;
	this.pick_address = pick_address;
	this.center_id = center_id;
}

public CarPickUp(int user_id, String c_name, String c_email, long c_mobile, String pick_address, int center_id,
		int pickup_id) {
	super();
	this.user_id = user_id;
	this.c_name = c_name;
	this.c_email = c_email;
	this.c_mobile = c_mobile;
	this.pick_address = pick_address;
	this.center_id = center_id;
	this.pickup_id = pickup_id;
}

public CarPickUp(int user_id, String pick_address) {
	super();
	this.user_id = user_id;
	this.pick_address = pick_address;
}

public CarPickUp(int user_id,double dummy) {
	super();
	this.user_id = user_id;
}

public CarPickUp(int center_id) {
	super();
	this.center_id = center_id;
}
public CarPickUp(int pick_id, int dummy) 
{
	// TODO Auto-generated constructor stub
	this.pickup_id=pick_id;
}
public CarPickUp(int pickup_id,int user_id,String c_name, String c_email, long c_mobile, String pick_address, int center_id) {
	super();
	this.pickup_id=pickup_id;
	this.user_id = user_id;
	this.c_name = c_name;
	this.c_email = c_email;
	this.c_mobile = c_mobile;
	this.pick_address = pick_address;
	this.center_id = center_id;
}

public CarPickUp(int pickup_id,int user_id, String c_name, String c_email, long c_mobile, String pick_address, int center_id,String status) {
	super();
	this.user_id = user_id;
	this.c_name = c_name;
	this.c_email = c_email;
	this.c_mobile = c_mobile;
	this.pick_address = pick_address;
	this.center_id = center_id;
	this.pickup_id = pickup_id;
	this.status=status;
}
@Override
public String toString() {
	return "carPickup \nuser_id=" + user_id + "\n c_name=" + c_name + "\n c_email=" + c_email + "\n c_mobile=" + c_mobile
			+ "\n pick_address=" + pick_address + "\n center_id=" + center_id + "\n";
}



}
