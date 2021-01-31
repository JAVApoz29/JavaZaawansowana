package generics;

public class AreaCalculator<T extends Shape> {

    private T shape;

    public AreaCalculator(T shape) {
        this.shape = shape;
    }

    public double calculateArea() {
        double area = shape.calculateArea();

        // TODO: jakaś dodatkowa logika wspólna dla shape

        return area;
    }
}
