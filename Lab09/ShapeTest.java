/*
⦁	Write a java program to create a class called Shape with a method called getArea().
⦁	Create a subclass called Circle and create a constructor that takes the value of radius(int) as input parameter.
⦁	Override the getArea() method
⦁	Create a class called square that takes an attributes length. Create a constructor that takes length as input.
⦁	Override the getArea() method
⦁	Create a subclass of Shape called Rectangle that takes width and height as input to the constructor
⦁	Override the getArea() method to calculate the area of rectangle. Instantiate and call getArea() method.
 */

package Lab09;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(4);
        Rectangle r = new Rectangle(3, 6);

        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Area of Square: " + s.getArea());
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}
