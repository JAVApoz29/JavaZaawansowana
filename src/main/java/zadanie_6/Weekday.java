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

    public boolean isLaterThan(Weekday compared) {
        int i = this.compareTo(compared);
        if (i > 0) {
            return true;
        } else {
            // jeśli i == 0 to this == compared
            // jeśli i < 0 to this < compared
            return false;
        }
    }
}
