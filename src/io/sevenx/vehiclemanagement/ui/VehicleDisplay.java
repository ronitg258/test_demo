package io.sevenx.vehiclemanagement.ui;
import java.util.List;

import io.sevenx.vehiclemanagement.data.Bike;
import io.sevenx.vehiclemanagement.data.Car;
import io.sevenx.vehiclemanagement.data.Vehicle;

public class VehicleDisplay {
	public static void display(List<Vehicle> vehicle, Bike bike, Car car) {
		for(Vehicle v : vehicle) {
			System.out.println("serial number is: "+v.getSerialNumber());
			System.out.println("brand is: "+v.getBrand());
			System.out.println("model is: "+v.getModel());
			System.out.println("fuel type is: "+v.getFuelType());
			System.out.println("maximum speed is: "+v.getMaximumSpeed()+"kmph");
			System.out.println("color is: "+v.getColor());
			if (v instanceof Bike) {
				Bike bike1 = (Bike)v;
				System.out.println("power is: "+bike1.getPower()+"PS");
				System.out.println("number of gears are: "+bike1.getNumberOfGears()+"\n");
			}
			else if (v instanceof Car) {
				Car car1 = (Car)v;
				System.out.println("horse power is: "+car1.getHorsePower()+"kW");
				System.out.println("transmission type is: "+car1.getTransmissionType()+"\n");
			}
		}
	}
}