package zadanie_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthorTest {

    private Author author;

    @BeforeEach
    public void beforeEach() {
        author = new Author("Jan Nowak", "jan.nowak@gmail.com", 'm');
    }

    @Test
    public void getNameTest() {
        assertEquals("Jan Nowak", author.getName());
    }

    @Test
    public void getEmailTest() {
        assertEquals("jan.nowak@gmail.com", author.getEmail());
    }

    @Test
    public void getGenderTest() {
        assertEquals('m', author.getGender());
    }

    @Test
    public void setEmaillTest() {
        author.setEmail("jan.nowak.2@gmail.com");
        assertEquals("jan.nowak.2@gmail.com", author.getEmail());
    }
}
