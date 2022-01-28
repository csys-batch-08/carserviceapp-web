package com.carserviceapp.model;

public class CenterDetails 
{
  private int centerId;
  private String centerName;
  private String centerLocation;
  private long centerContact;
  private String centerEmail;
  private String centerAddress;
  private int userId;


public int getCenterId() {
	return centerId;
}

public void setCenterId(int centerId) {
	this.centerId = centerId;
}

public String getCenterName() {
	return centerName;
}

public void setCenterName(String centerName) {
	this.centerName = centerName;
}

public String getCenterLocation() {
	return centerLocation;
}

public void setCenterLocation(String centerLocation) {
	this.centerLocation = centerLocation;
}

public long getCenterContact() {
	return centerContact;
}

public void setCenterContact(long centerContact) {
	this.centerContact = centerContact;
}

public String getCenterEmail() {
	return centerEmail;
}

public void setCenterEmail(String centerEmail) {
	this.centerEmail = centerEmail;
}

public String getCenterAddress() {
	return centerAddress;
}

public void setCenterAddress(String centerAddress) {
	this.centerAddress = centerAddress;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public CenterDetails() {
	super();
}

//for insert service center
public CenterDetails(int userId, String centerName, String centerLocation, long centerContact,
		String centerEmail, String centerAddress,String dummy) {
	super();
	this.userId = userId;
	this.centerName = centerName;
	this.centerLocation = centerLocation;
	this.centerContact = centerContact;
	this.centerEmail = centerEmail;
	this.centerAddress = centerAddress;
}

//for view service center
public CenterDetails(int centerId, String centerName, String centerLocation, long centerContact,
		String centerEmail, String centerAddress) {
	super();
	this.centerId = centerId;
	this.centerName = centerName;
	this.centerLocation = centerLocation;
	this.centerContact = centerContact;
	this.centerEmail = centerEmail;
	this.centerAddress = centerAddress;
}

public CenterDetails(int centerId) {
	super();
	this.centerId = centerId;
}


public CenterDetails(int centerId, long centerContact) {
	super();
	this.centerId = centerId;
	this.centerContact = centerContact;
}

@Override
public String toString() {
	return "center_id=" + centerId + "\n center_name=" + centerName + "\n center_location="
			+ centerLocation + "\n center_contact=" + centerContact + "\n center_email=" + centerEmail
			+ "\n center_address=" + centerAddress+"\n";
}
  
}
