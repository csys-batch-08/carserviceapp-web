package com.carserviceapp.model;

public class ServiceDetails 
{
  private int detail_id;
  private int user_id;
  private int service_id;
public int getDetail_id() {
	return detail_id;
}
public void setDetail_id(int detail_id) {
	this.detail_id = detail_id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public int getService_id() {
	return service_id;
}
public void setService_id(int service_id) {
	this.service_id = service_id;
}
public ServiceDetails(int user_id, int service_id) {
	super();
	this.user_id = user_id;
	this.service_id = service_id;
}
public ServiceDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public ServiceDetails(int serv_id) 
{
	// TODO Auto-generated constructor stub
	this.service_id=serv_id;
}
@Override
public String toString() {
	return "serviceDetails [detail_id=" + detail_id + ", user_id=" + user_id + ", service_id=" + service_id + "]";
}
  
  
}
