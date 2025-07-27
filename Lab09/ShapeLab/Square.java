package Lab09;

public class Square extends Shape {
    int length;

    public Square(int l) {
        length = l;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
