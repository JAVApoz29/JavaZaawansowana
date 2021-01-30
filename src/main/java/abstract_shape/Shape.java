package abstract_shape;

public abstract class Shape extends Object {

    public abstract double calculateArea();

    public String getName() {
        return "Shape";
    }

    public String getName(String name) {
        return name + ":Shape";
    }
}
