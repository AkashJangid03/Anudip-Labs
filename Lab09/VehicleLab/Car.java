package Lab09;

public class Car extends Vehicle {
	public Car(String makeParameter, String modelParameter, int yearParameter, int speedParameter) {
		super(makeParameter, modelParameter, yearParameter, speedParameter);
	}
	
	@Override
	public void drive() {
		System.out.println(make+" "+model+" Car is driving");
	}
}