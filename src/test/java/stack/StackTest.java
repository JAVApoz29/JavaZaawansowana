package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void beforeEach() {
        stack = new Stack(1);
    }

    @Test
    public void pushPositiveTest() throws StackIsFullException, StackIsEmptyException {
        stack.push("Element");
        assertEquals(1, stack.getLength());
        assertEquals("Element", stack.peek());
    }

    @Test
    public void pushNegativeTest() throws StackIsFullException{
        stack.push("Element");
        assertThrows(StackIsFullException.class, () -> stack.push("Element"));
    }

    @Test
    public void peekPositiveTest() throws StackIsFullException, StackIsEmptyException {
        stack.push("Element");
        assertEquals("Element", stack.peek());
    }

    @Test
    public void peekNegativeTest() {
        assertThrows(StackIsEmptyException.class, () -> stack.peek());
    }

    @Test
    public void popPositiveTest() throws StackIsFullException, StackIsEmptyException {
        stack.push("Element");
        assertEquals("Element", stack.pop());
        assertEquals(0, stack.getLength());
    }

    @Test
    public void popNegativeTest() {
        assertThrows(StackIsEmptyException.class, () -> stack.pop());
    }
}
