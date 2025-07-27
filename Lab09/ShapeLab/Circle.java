package Lab09;

public class Circle extends Shape {
    int radius;

    public Circle(int r) {
        radius = r;
    }

    @Override
    public double getArea() {
        return 3.14159 * radius * radius;
    }
}
