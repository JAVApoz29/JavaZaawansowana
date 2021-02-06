package zadanie_4;

import java.util.Objects;

public class Rectangle extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() throws NegativeValueException {
        if (width < 0 || length < 0) {
            throw new NegativeValueException();
        }

        return width * length;
    }

    @Override
    public double getPerimeter() throws NegativeValueException {
        if (width < 0 || length < 0) {
            throw new NegativeValueException();
        }
        return 2 * width + 2 * length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }
}
