package interface_example;

public class Dog implements Pet, Animal, Comparable, MarkerInterface {

    @Override
    public void test() {

    }

    @Override
    public void test2() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
