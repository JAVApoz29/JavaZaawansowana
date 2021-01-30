package zadanie_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    private Book book;
    private Author author = new Author("Jan Nowak", "jan.nowak@gmail.com", 'm');

    @BeforeEach
    public void beforeEach() {
        book = new Book("Java - zaawansowana", author, 100.0);
    }

    @Test
    public void getNameTest() {
        assertEquals("Java - zaawansowana", book.getName());
    }

    @Test
    public void getAuthorTest() {
        assertEquals(author, book.getAuthor());
    }

    @Test
    public void getPriceTest() {
        assertEquals(100.0, book.getPrice());
    }

    @Test
    public void setPriceTest() {
        book.setPrice(123.9);
        assertEquals(123.9, book.getPrice());
    }
}
