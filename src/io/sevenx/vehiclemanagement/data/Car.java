package io.sevenx.vehiclemanagement.data;

public class Car extends Vehicle{
	private double horsePower;
	private String transmissionType;
	public double getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
}