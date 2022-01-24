package com.carserviceapp.model;

public class CarServices 
{
private int service_id;
private String service_name;
private int service_cost;
private String service_desc;

public int getService_id() {
	return service_id;
}
public void setService_id(int service_id) {
	this.service_id = service_id;
}
public String getService_name() {
	return service_name;
}
public void setService_name(String service_name) {
	this.service_name = service_name;
}
public int getService_cost() {
	return service_cost;
}
public void setService_cost(int service_cost) {
	this.service_cost = service_cost;
}
public String getService_desc() {
	return service_desc;
}
public void setService_desc(String service_desc) {
	this.service_desc = service_desc;
}
public CarServices() {
	super();
	// TODO Auto-generated constructor stub
}
public CarServices(String service_name, int service_cost, String service_desc) {
	super();
	this.service_name = service_name;
	this.service_cost = service_cost;
	this.service_desc = service_desc;
}

public CarServices( String service_name, int service_cost, String service_desc,int service_id) {
	super();
	this.service_id = service_id;
	this.service_name = service_name;
	this.service_cost = service_cost;
	this.service_desc = service_desc;
}
public CarServices(int service_id, int service_cost) {
	super();
	this.service_id = service_id;
	this.service_cost = service_cost;
}

public CarServices(int service_id) {
	super();
	this.service_id = service_id;
}


public CarServices(int service_id, String service_name, int service_cost, String service_desc) {
	super();
	this.service_id = service_id;
	this.service_name = service_name;
	this.service_cost = service_cost;
	this.service_desc = service_desc;
}
@Override
public String toString() {
	return "carServices\nservice_id=" + service_id + "\nservice_name=" + service_name + "\nservice_cost=" + service_cost
			+ "\nservice_desc=" + service_desc + "\n\n";
}


}
