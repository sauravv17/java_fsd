package oops;

public class Car {
	
	private String fuelType;
	private int noWheels;
	private String gearType;
	private String colour;
	
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getNoWheels() {
		return noWheels;
	}
	public void setNoWheels(int i) {
		this.noWheels = i;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Car [fuelType=" + fuelType + ", noWheels=" + noWheels + ", gearType=" + gearType + ", colour=" + colour
				+ "]";
	}
	

}
