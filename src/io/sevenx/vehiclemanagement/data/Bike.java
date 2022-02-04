package io.sevenx.vehiclemanagement.data;

public class Bike extends Vehicle{
	private double power;
	private int numberOfGears;
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public int getNumberOfGears() {
		return numberOfGears;
	}
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
}