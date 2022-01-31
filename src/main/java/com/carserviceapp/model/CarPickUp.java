package com.carserviceapp.model;

public class CarPickUp 
{
private int userId;
private String cName;
private String cEmail;
private long cMobile;
private String pickAddress;
private int centerId;
private int pickupId;
private String status;
private double dummy;
private int norm;

public int getUserId() {
	return userId;
}


public void setUserId(int userId) {
	this.userId = userId;
}


public String getcName() {
	return cName;
}


public void setcName(String cName) {
	this.cName = cName;
}


public String getcEmail() {
	return cEmail;
}


public void setcEmail(String cEmail) {
	this.cEmail = cEmail;
}


public long getcMobile() {
	return cMobile;
}


public void setcMobile(long cMobile) {
	this.cMobile = cMobile;
}


public String getPickAddress() {
	return pickAddress;
}


public void setPickAddress(String pickAddress) {
	this.pickAddress = pickAddress;
}


public int getCenterId() {
	return centerId;
}


public void setCenterId(int centerId) {
	this.centerId = centerId;
}


public int getPickupId() {
	return pickupId;
}


public void setPickupId(int pickupId) {
	this.pickupId = pickupId;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}

public int getNorm() {
	return norm;
}


public void setNorm(int norm) {
	this.norm = norm;
}
public double getDummy() {
	return dummy;
}


public void setDummy(double dummy) {
	this.dummy = dummy;
}

public CarPickUp()
{
	super();
}


public CarPickUp(int userId,String cName, String cEmail, long cMobile, String pickAddress, int centerId) {
	super();
	this.userId = userId;
	this.cName = cName;
	this.cEmail = cEmail;
	this.cMobile = cMobile;
	this.pickAddress = pickAddress;
	this.centerId = centerId;
}

public CarPickUp(int userId, String cName, String cEmail, long cMobile, String pickAddress, int centerId,
		int pickupId) {
	super();
	this.userId = userId;
	this.cName = cName;
	this.cEmail = cEmail;
	this.cMobile = cMobile;
	this.pickAddress = pickAddress;
	this.centerId = centerId;
	this.pickupId = pickupId;
}

public CarPickUp(int userId, String pickAddress) {
	super();
	this.userId = userId;
	this.pickAddress = pickAddress;
}

public CarPickUp(int userId,double dummy) {
	super();
	this.userId = userId;
	this.dummy=dummy;
}

public CarPickUp(int centerId) {
	super();
	this.centerId = centerId;
}
public CarPickUp(int pickId, int norm) 
{
	this.pickupId=pickId;
	this.norm=norm;
}
public CarPickUp(int pickupId,int userId,String cName, String cEmail, long cMobile, String pickAddress, int centerId) {
	super();
	this.pickupId=pickupId;
	this.userId = userId;
	this.cName = cName;
	this.cEmail = cEmail;
	this.cMobile = cMobile;
	this.pickAddress = pickAddress;
	this.centerId = centerId;
}
public CarPickUp(int pickupId,int userId, String cName, long cMobile, String pickAddress, int centerId,String status) {
	super();
	this.userId = userId;
	this.cName = cName;
	this.cMobile = cMobile;
	this.pickAddress = pickAddress;
	this.centerId = centerId;
	this.pickupId = pickupId;
	this.status=status;
}
@Override
public String toString() {
	return "carPickup \nuser_id=" + userId + "\n c_name=" + cName + "\n c_email=" + cEmail + "\n c_mobile=" + cMobile
			+ "\n pick_address=" + pickAddress + "\n center_id=" + centerId + "\n";
}
}
