package abstract_shape;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.calculateArea();

        Shape triangle = new Triangle();

        Rectangle rectangle = new Rectangle();

        circle.calculateArea();
        rectangle.calculateArea();

        System.out.println(circle.getName());
    }
}
