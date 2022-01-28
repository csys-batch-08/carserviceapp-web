package com.carserviceapp.model;

public class ServiceDetails 
{
  private int detailId;
  private int userId;
  private int serviceId;
  
public int getDetailId() {
	return detailId;
}
public void setDetailId(int detailId) {
	this.detailId = detailId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getServiceId() {
	return serviceId;
}
public void setServiceId(int serviceId) {
	this.serviceId = serviceId;
}
public ServiceDetails(int userId, int serviceId) {
	super();
	this.userId = userId;
	this.serviceId = serviceId;
}
public ServiceDetails() {
	super();
}
public ServiceDetails(int servId) 
{
	this.serviceId=servId;
}
@Override
public String toString() {
	return "serviceDetails [detail_id=" + detailId + ", user_id=" + userId + ", service_id=" + serviceId + "]";
}
  
  
}
