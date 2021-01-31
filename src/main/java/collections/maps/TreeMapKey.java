package collections.maps;

import java.util.Comparator;

public class TreeMapKey implements Comparable<TreeMapKey> {

    private int wage;

    public TreeMapKey(int wage) {
        this.wage = wage;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public int compareTo(TreeMapKey treeMapKey) {
        return wage - treeMapKey.getWage();
    }

    @Override
    public String toString() {
        return "TreeMapKey{" +
                "wage=" + wage +
                '}';
    }
}
