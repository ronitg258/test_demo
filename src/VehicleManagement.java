package io.sevenx.vehiclemanagement;

public class VehicleManagement {
	public static void main(String args[]) {
	Car car=new Car();
	car.start("Car");
	car.stop("Car");
	car.typeOfVehicle("Car");
	car.setNumberOfSeats(4);
	car.setNumberOfWheels(4);
	System.out.println("No. Of Seats"+" "+car.getNumberOfSeats());
	System.out.println("No. Of Wheels"+" "+car.getNumberOfWheels()+"\n");
	
	Bike bike=new Bike();
	bike.start("Bike");
	bike.stop("Bike");
	bike.typeOfVehicle("Bike");
	bike.setNumberOfSeats(2);
	bike.setNumberOfWheels(2);
	System.out.println("No. Of Seats"+" "+bike.getNumberOfSeats());
	System.out.println("No. Of Wheels"+" "+bike.getNumberOfWheels());
	}
}
