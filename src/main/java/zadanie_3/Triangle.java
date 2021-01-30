package zadanie_3;

public class Triangle {

    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getArea() {
        return 0.5 * Math.abs(
                (v2.getX() - v1.getX()) * (v3.getY() - v1.getY()) -
                (v2.getY() - v1.getY()) * (v3.getX() - v1.getX()));
    }

    public double getPerimeter() {
        return
                Math.sqrt(Math.pow((v2.getX() - v1.getX()), 2) + Math.pow((v2.getY() - v1.getY()), 2)) +
                Math.sqrt(Math.pow((v3.getX() - v2.getX()), 2) + Math.pow((v3.getY() - v2.getY()), 2)) +
                Math.sqrt(Math.pow((v3.getX() - v1.getX()), 2) + Math.pow((v3.getY() - v1.getY()), 2));
    }
}
