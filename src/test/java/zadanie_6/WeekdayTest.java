package zadanie_6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;

public class WeekdayTest {

    @EnumSource(value = Weekday.class, names = { "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" })
    @ParameterizedTest
    public void weekdayTest(Weekday weekday) {
        assertTrue(weekday.isWeekDay());
        assertFalse(weekday.isHoliday());
    }

    @EnumSource(value = Weekday.class, names = { "SATURDAY", "SUNDAY" })
    @ParameterizedTest
    public void holidayTest(Weekday weekday) {
        assertTrue(weekday.isHoliday());
        assertFalse(weekday.isWeekDay());
    }
}
