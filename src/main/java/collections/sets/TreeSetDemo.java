package collections.sets;

import collections.maps.TreeMapKey;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<TreeMapKey> treeMap = new TreeSet<>();

        treeMap.add(new TreeMapKey(1));
        treeMap.add(new TreeMapKey(23));
        treeMap.add(new TreeMapKey(70));
        treeMap.add(new TreeMapKey(4));
        treeMap.add(new TreeMapKey(2));

        System.out.println(treeMap);
    }
}
