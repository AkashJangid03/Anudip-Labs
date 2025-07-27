package Lab09;

public class Bike extends Vehicle {
	public Bike(String makeParameter, String modelParameter, int yearParameter, int speedParameter) {
		super(makeParameter, modelParameter, yearParameter, speedParameter);
	}
	
	@Override
	public void drive() {
		System.out.println(make+" "+model+" Bike is driving");
	}
}