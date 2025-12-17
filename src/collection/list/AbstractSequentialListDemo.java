package collection.list;

import java.util.AbstractSequentialList;
import java.util.Arrays;
import java.util.ListIterator;

public class AbstractSequentialListDemo extends AbstractSequentialList<String> {

    String[] arr = {"a", "b", "c", "d"};

    @Override
    public ListIterator<String> listIterator(int index) {
        return Arrays.asList(arr).listIterator(index);
    }

    @Override
    public int size() {
        return arr.length;
    }


}
