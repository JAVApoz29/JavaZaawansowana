package zadanie_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    private Triangle triangle;
    private Point v1 = new Point(0, 0);
    private Point v2 = new Point(4, 0);
    private Point v3 = new Point(0, 3);

    @BeforeEach
    public void beforeEach() {
        triangle = new Triangle(v1, v2, v3);
    }

    @Test
    public void triangleTest() {
        assertNotNull(triangle);
    }

    @Test
    public void getAreaTest() {
        assertEquals(6.0, triangle.getArea());
    }

    @Test
    public void getPerimeterTest() {
        assertEquals(12.0, triangle.getPerimeter());
    }
}
