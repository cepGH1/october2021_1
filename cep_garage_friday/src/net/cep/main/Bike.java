package net.cep.main;

public class Bike extends Vehicle implements Treatment{
private boolean electric;

public Bike(String ownerName, String colour, boolean isInPerfectWorkingOrder, boolean electric) {
	super(ownerName, colour, isInPerfectWorkingOrder);
	this.electric = electric;
}


public boolean isElectric() {
	return electric;
}


public void setElectric(boolean electric) {
	this.electric = electric;
}


public String fixVehicle() {
	String result = "";
	if(!this.isInPerfectWorkingOrder()) {
		this.setInPerfectWorkingOrder(true);
		result = "vehicle fixed";
		
	}else { result = "vehicle doesn't need a service"; }
	result = result + this.reminder();
	return result;
}

public String reminder() {

	String result = " Do you need a helmet?";
	return result;
}
}