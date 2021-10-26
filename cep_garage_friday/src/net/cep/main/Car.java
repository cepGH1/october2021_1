package net.cep.main;

public class Car extends Vehicle {
String registration;
String make;
//constructor
public Car(String ownerName, String colour, boolean isInPerfectWorkingOrder, String registration, String make) {
	super(ownerName, colour, isInPerfectWorkingOrder);
	this.registration = registration;
	this.make = make;
	System.out.println(this.make);
}
public String getRegistration() {
	return registration;
}
public void setRegistration(String registration) {
	this.registration = registration;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}

public String fixVehicle() {
	String result = "";
	if(!this.isInPerfectWorkingOrder()) {
		this.setInPerfectWorkingOrder(true);
		result = "vehicle fixed";
		
	}else { result = "vehicle doesn't need a service"; }
	
	return result;
}


}
