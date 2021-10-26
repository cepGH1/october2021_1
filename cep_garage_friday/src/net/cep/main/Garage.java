package net.cep.main;

import java.util.ArrayList;

public class Garage {
	
ArrayList<Vehicle> vehicles;


public Garage() {
	vehicles = new ArrayList<>();
}
// outputs the owner name of each vehicle in the araylist of vehicles
public void showVehicles() {
	for(Vehicle banger:vehicles) {
		System.out.print(banger.getOwnerName());
	}
}
// add vehicle to the arraylist of vehicles
public void addVehicle(Vehicle myVehicleType) {
	this.vehicles.add(myVehicleType);
	
	System.out.println("added "  );
}
// 
public void removeVehicle(Vehicle vehicleType) {
	int index = vehicles.indexOf(vehicleType);
	this.vehicles.remove(index);
	System.out.println(vehicleType.getOwnerName() + " has his vehicle returned" );
}

public String letsCloseGarage() {
	String result = "";
	this.vehicles.clear();
	result = "Garage has been emptied";
	return result;
}
public String fixVehicle(Vehicle myVehicle) {
	String result = myVehicle.fixVehicle();
	return result;
}

@Override
public String toString() {
	return "Garage [vehicles=" + vehicles + ", letsCloseGarage()=" + letsCloseGarage() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
