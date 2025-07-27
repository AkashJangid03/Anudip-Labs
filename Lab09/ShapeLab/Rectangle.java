package Lab09;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
