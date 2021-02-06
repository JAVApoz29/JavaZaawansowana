package zadanie_6;

public class Main {
    public static void main(String[] args) {

        Weekday day = Weekday.THURSDAY;
        for (Weekday weekday : Weekday.values()) {
            System.out.println("porównuję " + day + " i " + weekday + ": " + day.isLaterThan(weekday));
        }

    }
}
