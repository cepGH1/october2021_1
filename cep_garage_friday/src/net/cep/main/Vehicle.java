package net.cep.main;

public abstract class Vehicle {
private String ownerName;
private String colour;
private boolean isInPerfectWorkingOrder;

//constructor
public Vehicle(String ownerName, String colour, boolean isInPerfectWorkingOrder) {
	super();
	this.ownerName = ownerName;
	this.colour = colour;
	this.isInPerfectWorkingOrder = isInPerfectWorkingOrder;
}
//getters and setters
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public boolean isInPerfectWorkingOrder() {
	return isInPerfectWorkingOrder;
}
public void setInPerfectWorkingOrder(boolean isInPerfectWorkingOrder) {
	this.isInPerfectWorkingOrder = isInPerfectWorkingOrder;
}

public abstract String fixVehicle();
	




}
