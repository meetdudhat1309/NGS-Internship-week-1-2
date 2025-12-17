package collection.list;

import java.util.AbstractList;

public class AbstractListDemo extends AbstractList<Integer> {

    int[] arr = {1,2,3,4,5,6,7,8,9};
    @Override
    public Integer get(int index) {
        return arr[index];
    }

    @Override
    public int size() {
        return arr.length;
    }
}
