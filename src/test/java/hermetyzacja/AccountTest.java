package hermetyzacja;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account account;

    @BeforeEach
    public void beforeEach() {
        account = new Account();
    }

    @Test
    public void depositTestGreaterThanZero() {
        assertTrue(account.deposit(100));
    }

    @Test
    public void depositTestLessThanZero() {
        assertFalse(account.deposit(-100));
    }
}
