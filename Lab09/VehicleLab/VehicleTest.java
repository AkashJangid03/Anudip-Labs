/*
⦁	Write a java program to create a class Vehicle with a method called drive();
⦁	Vehicle should have attributes such as make(String), model(string), year(int) and maximumSpeed(int).
⦁	Create a constructor in Vehicle with all fields as constructor parameters.
⦁	Create a subclass called Car and override constructor . Call super()
⦁	Write a function that overrides the drive() method to print (make +" "+ model + "Car is driving".)
⦁	Also create another subclass Bike extending the vehicle class
⦁	Override the drive() method to print (make +" "+ model + "Bike is driving".)
⦁	Instantiate both Bike and Car class. Print their attributes. 

 */

package Lab09;

public class VehicleTest {
	public static void main(String[] args) {
		Car car = new Car("Ford", "Mustang", 2020, 250);
        System.out.println("Car Attributes:");
        car.printAttribute();
        car.drive();

        System.out.println();

        Bike bike = new Bike("Honda", "Shine", 2020, 200);
        System.out.println("Bike Attributes:");
        bike.printAttribute();
        bike.drive();
	}
}
