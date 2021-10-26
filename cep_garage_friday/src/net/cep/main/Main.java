package net.cep.main;

public class Main {

	public static void main(String[] args) {
		garageStarter();

	}
public static void garageStarter() {
	Garage myGarage = new Garage();
	Vehicle myFirstCar = new Car("clare", "blue", true, "SG10 FDB", "BMW");
	Vehicle myFirstBike = new Bike("fish", "red", false, false);
	Vehicle myFirstMotorbike = new MotorBike("Troy", "red", false, true);
	myGarage.addVehicle(myFirstBike);
	myGarage.addVehicle(myFirstCar);
	myGarage.addVehicle(myFirstMotorbike);
	//System.out.println(myGarage.toString());
	myGarage.showVehicles();
	System.out.println(myGarage.fixVehicle(myFirstMotorbike));
	System.out.println(myGarage.fixVehicle(myFirstMotorbike));
	myGarage.removeVehicle(myFirstMotorbike);
	myGarage.letsCloseGarage();
	myGarage.showVehicles();
	
}
}
