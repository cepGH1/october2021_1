package net.cep.main;

public class MotorBike extends Vehicle {
private boolean loudExhaust;
// constructor
public MotorBike(String ownerName, String colour, boolean isInPerfectWorkingOrder, boolean loudExhaust) {
	super(ownerName, colour, isInPerfectWorkingOrder);
	this.loudExhaust = loudExhaust;
}


//getters and setters
public boolean isLoudExhaust() {
	return loudExhaust;
}



public void setLoudExhaust(boolean loudExhaust) {
	this.loudExhaust = loudExhaust;
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
