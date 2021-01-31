package collections.sets;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Orange");

        System.out.println(hashSet);

        hashSet.add("Apple");
        hashSet.add("Orange");

        System.out.println(hashSet);

        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);

        for (String str : hashSet) {
            System.out.println(str);
        }
    }
}
