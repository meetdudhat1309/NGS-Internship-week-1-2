package collection.set;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

public class AbstractSetDemo extends AbstractSet<Integer> {
    Integer[] arr = {1,2,3,4,5,6,7,8,9};
    @Override
    public Iterator<Integer> iterator() {
        return Arrays.asList(arr).iterator();
    }

    @Override
    public int size() {
        return arr.length;
    }
}
