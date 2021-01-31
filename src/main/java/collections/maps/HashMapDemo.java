package collections.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(12, "Jacek");
        hashMap.put(2, "Romek");
        hashMap.put(7, "Adam");
        hashMap.put(49, "Edmund");
        hashMap.put(3, "Andrzej");

        System.out.println(hashMap);

        String val = hashMap.get(12);
        System.out.println(val);

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println("key is: " + mentry.getKey() + " & value is " + mentry.getValue());
        }

        hashMap.remove(12);
        System.out.println(hashMap);
    }
}
