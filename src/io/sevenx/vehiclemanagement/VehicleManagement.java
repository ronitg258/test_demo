package io.sevenx.vehiclemanagement;
import java.util.*;
import io.sevenx.vehiclemanagement.data.Bike;
import io.sevenx.vehiclemanagement.data.Car;
import io.sevenx.vehiclemanagement.data.Vehicle;
import io.sevenx.vehiclemanagement.ui.VehicleDisplay;

public class VehicleManagement {
	public static void main(String args[]) {
		Vehicle bike = new Bike();
		bike.setSerialNumber(12110);
		bike.setBrand("Hero");
		bike.setModel("Splendor");
		bike.setFuelType("Petrol");
		bike.setMaximumSpeed(110);
		bike.setColor("Black");
		
		Vehicle car = new Car();
		car.setSerialNumber(14110);
		car.setBrand("Tata");
		car.setModel("Harrier");
		car.setFuelType("Diesel");
		car.setMaximumSpeed(180);
		car.setColor("Grey");
		
		Bike bike1 = new Bike();
		bike1.setPower(8.36);
		bike1.setNumberOfGears(5);
		
		Car car1 = new Car();
		car1.setHorsePower(125);
		car1.setTransmissionType("Automatic");
		
		List <Vehicle> vehicle = new ArrayList <Vehicle>();
		vehicle.add(bike);
		vehicle.add(car);
		VehicleDisplay.display(vehicle, bike1, car1);
	}
}