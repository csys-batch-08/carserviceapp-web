package com.carserviceapp.model;

public class CenterDetails 
{
  private int center_id;
  private String center_name;
  private String center_location;
  private long center_contact;
  private String center_email;
  private String center_address;
  private int user_id;

public int getCenter_id() {
	return center_id;
}

public void setCenter_id(int center_id) {
	this.center_id = center_id;
}

public String getCenter_name() {
	return center_name;
}

public void setCenter_name(String center_name) {
	this.center_name = center_name;
}

public String getCenter_location() {
	return center_location;
}

public void setCenter_location(String center_location) {
	this.center_location = center_location;
}

public long getCenter_contact() {
	return center_contact;
}

public void setCenter_contact(long center_contact) {
	this.center_contact = center_contact;
}

public String getCenter_email() {
	return center_email;
}

public void setCenter_email(String center_email) {
	this.center_email = center_email;
}

public String getCenter_address() {
	return center_address;
}

public void setCenter_address(String center_address) {
	this.center_address = center_address;
}

public int getUser_id() {
	return user_id;
}

public void setUser_id(int user_id) {
	this.user_id = user_id;
}

public CenterDetails() {
	super();
	// TODO Auto-generated constructor stub
}

//for insert service center
public CenterDetails(int user_id, String center_name, String center_location, long center_contact,
		String center_email, String center_address,String dummy) {
	super();
	this.user_id = user_id;
	this.center_name = center_name;
	this.center_location = center_location;
	this.center_contact = center_contact;
	this.center_email = center_email;
	this.center_address = center_address;
}

//for view service center
public CenterDetails(int center_id, String center_name, String center_location, long center_contact,
		String center_email, String center_address) {
	super();
	this.center_id = center_id;
	this.center_name = center_name;
	this.center_location = center_location;
	this.center_contact = center_contact;
	this.center_email = center_email;
	this.center_address = center_address;
}

public CenterDetails(int center_id) {
	super();
	this.center_id = center_id;
}


public CenterDetails(int center_id, long center_contact) {
	super();
	this.center_id = center_id;
	this.center_contact = center_contact;
}

@Override
public String toString() {
	return "center_id=" + center_id + "\n center_name=" + center_name + "\n center_location="
			+ center_location + "\n center_contact=" + center_contact + "\n center_email=" + center_email
			+ "\n center_address=" + center_address+"\n";
}
  
}
