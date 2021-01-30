package zadanie_3;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        if (x < 0 || y < 0) {
            throw new NegativeCoordinateException();
        }

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
