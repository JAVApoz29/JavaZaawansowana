package zadanie_4;

public class Circle extends Shape {

    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() throws NegativeValueException {
        if (radius < 0) {
            throw new NegativeValueException();
        }

        // wzrór na pole koła
        return 0;
    }

    @Override
    public double getPerimeter() throws NegativeValueException {
        if (radius < 0) {
            throw new NegativeValueException();
        }
        // wzór na obwód kola
        return 0;
    }
}
