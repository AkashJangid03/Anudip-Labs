/*
Create an abstract class called Shape with an abstract method calculateArea().
Implement two subclasses, Circle and Rectangle, which inherit from Shape and provide their own implementations of calculateArea().
Write a program to calculate and print the areas of a circle and a rectangle.
 */

package Lab11;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    int radius;

    Circle(int r) {
        radius = r;
    }

    @Override
    double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    int width, height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 7);

        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
