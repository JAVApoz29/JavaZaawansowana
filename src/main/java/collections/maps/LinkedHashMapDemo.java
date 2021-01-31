package collections.maps;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<TreeMapKey, String> treeMap = new LinkedHashMap<>();

        treeMap.put(new TreeMapKey(1), "Data8");
        treeMap.put(new TreeMapKey(23), "Data7");
        treeMap.put(new TreeMapKey(70), "Data6");
        treeMap.put(new TreeMapKey(4), "Data5");
        treeMap.put(new TreeMapKey(2), "Data4");

        System.out.println(treeMap);
    }
}
