package Lab09;

public class Vehicle {
	String make;
	String model;
	int year;
	int maximumSpeed;
	
	public Vehicle(String makeParameter, String modelParameter, int yearParameter, int speedParameter) {
		make = makeParameter;
		model = modelParameter;
		year = yearParameter;
		maximumSpeed = speedParameter;
	}
	
	public void drive() {
		System.out.println("Vehicle is driving");
	}
	
	public void printAttribute() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Maximum Speed: "+maximumSpeed);
	}

}
