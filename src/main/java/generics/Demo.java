package generics;

import java.util.Comparator;
import java.util.Observable;

public class Demo implements Comparable<Demo> {

    private int wage;

    public Demo(int wage) {
        this.wage = wage;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public int compareTo(Demo demo) {

        if (this.getWage() < demo.getWage()) {
            return - 1;
        } else if (this.getWage() == demo.getWage()) {
            return 0;
        } else {
            return 1;
        }
    }
}
