package com.carserviceapp.model;

public class CarServices 
{
private int serviceId;
private String serviceName;
private int serviceCost;
private String serviceDesc;


public int getServiceId() {
	return serviceId;
}
public void setServiceId(int serviceId) {
	this.serviceId = serviceId;
}
public String getServiceName() {
	return serviceName;
}
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}
public int getServiceCost() {
	return serviceCost;
}
public void setServiceCost(int serviceCost) {
	this.serviceCost = serviceCost;
}
public String getServiceDesc() {
	return serviceDesc;
}
public void setServiceDesc(String serviceDesc) {
	this.serviceDesc = serviceDesc;
}
public CarServices() {
	super();
}
public CarServices(String serviceName, int serviceCost, String serviceDesc) {
	super();
	this.serviceName = serviceName;
	this.serviceCost = serviceCost;
	this.serviceDesc = serviceDesc;
}

public CarServices( String serviceName, int serviceCost, String serviceDesc,int serviceId) {
	super();
	this.serviceId = serviceId;
	this.serviceName = serviceName;
	this.serviceCost = serviceCost;
	this.serviceDesc = serviceDesc;
}
public CarServices(int serviceId, int serviceCost) {
	super();
	this.serviceId = serviceId;
	this.serviceCost = serviceCost;
}

public CarServices(int serviceId) {
	super();
	this.serviceId = serviceId;
}


public CarServices(int serviceId, String serviceName, int serviceCost, String serviceDesc) {
	super();
	this.serviceId = serviceId;
	this.serviceName = serviceName;
	this.serviceCost = serviceCost;
	this.serviceDesc = serviceDesc;
}
@Override
public String toString() {
	return "carServices\nservice_id=" + serviceId + "\nservice_name=" + serviceName + "\nservice_cost=" + serviceCost
			+ "\nservice_desc=" + serviceDesc + "\n\n";
}


}
