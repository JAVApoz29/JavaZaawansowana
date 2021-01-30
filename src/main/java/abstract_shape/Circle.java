package abstract_shape;

public class Circle extends Shape {
    @Override
    public double calculateArea() {
        return 0;
    }

    public double calculatePermiter() {
        return 0;
    }

    @Override
    public String getName() {
        return super.getName() + ":Circle";
    }
}
