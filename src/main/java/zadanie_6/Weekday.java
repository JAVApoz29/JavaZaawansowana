package zadanie_6;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        return !isWeekDay();
    }
}
