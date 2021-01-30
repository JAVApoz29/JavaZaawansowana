package zadanie_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    private Point point;

    @BeforeEach
    public void beforeEach() {
        point = new Point(1, 2);
    }

    @Test
    public void testPoint() {
        assertNotNull(point);
    }

    @Test
    public void getXTest() {
        assertEquals(1, point.getX());
    }

    @Test
    public void getYTest() {
        assertEquals(2, point.getY());
    }
}
