package io.sevenx.vehiclemanagement;
import java.util.*;
import io.sevenx.vehiclemanagement.data.Bike;
import io.sevenx.vehiclemanagement.data.Car;
import io.sevenx.vehiclemanagement.data.Vehicle;

public class VehicleManagement {
	public static void main(String args[]) {
		Vehicle bike=new Bike();
		bike.setSerialNumber(12110);
		bike.setBrand("Hero");
		bike.setModel("Splendor");
		bike.setFuelType("Petrol");
		bike.setMaximumSpeed(110);
		bike.setColor("Black");
		
		Vehicle car=new Car();
		car.setSerialNumber(14110);
		car.setBrand("Tata");
		car.setModel("Harrier");
		car.setFuelType("Diesel");
		car.setMaximumSpeed(180);
		car.setColor("Grey");
		
		List <Vehicle> vehicle=new ArrayList <Vehicle>();
		vehicle.add(bike);
		vehicle.add(car);
		for(Vehicle v:vehicle) {
			System.out.println("serial number is: "+v.getSerialNumber());
			System.out.println("brand is: "+v.getBrand());
			System.out.println("model is: "+v.getModel());
			System.out.println("fuel type is: "+v.getFuelType());
			System.out.println("maximum speed is: "+v.getMaximumSpeed()+"kmph");
			System.out.println("color is: "+v.getColor());
			if (v instanceof Bike) {
				Bike bike1=(Bike)v;
				bike1.setPower(8.36);
				bike1.setNumberOfGears(5);
				System.out.println("power is: "+bike1.getPower()+"PS");
				System.out.println("number of gears are: "+bike1.getNumberOfGears()+"\n");
			}
			else if (v instanceof Car) {
				Car car1=(Car)v;
				car1.setHorsePower(125);
				car1.setTransmissionType("Automatic");
				System.out.println("horse power is: "+car1.getHorsePower()+"kW");
				System.out.println("transmission type is: "+car1.getTransmissionType()+"\n");
			}
		}
	}
}