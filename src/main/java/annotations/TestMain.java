package annotations;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        Test test = new Test();
        test.setWeight(10);
        System.out.println(test.getWeight());

        List list = new ArrayList();

        @SuppressWarnings("unchecked")
        List<Integer> integers = (List<Integer>) list;
    }
}
