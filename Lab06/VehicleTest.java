package Lab06;

public class VehicleTest {

	public static void main(String[] args) {
		Car car = new Car();
		Motorcycle motorcycle = new Motorcycle();
		Garage garage = new Garage();
		
		garage.serviceVehicle(car);
		garage.serviceVehicle(motorcycle);
	}

}
