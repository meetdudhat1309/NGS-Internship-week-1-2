package collection.list;

import java.lang.reflect.Array;
import java.util.*;

public class FixedSizedStringList extends AbstractList<String> {
    List<String> mList;


    public FixedSizedStringList(String[] list) {
        mList = Arrays.asList(list);
    }

    @Override
    public String get(int index) {
        if (index < mList.size()) {
            return mList.get(index);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return mList.size();
    }

    @Override
    public Iterator<String> iterator() {
        return mList.iterator();
    }

    @Override
    public boolean add(String s) {
        throw new UnsupportedOperationException("Fixed size list");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Fixed size list");
    }

    @Override
    public String set(int index, String element) {
        if (index<0 || index>=mList.size()) throw new IndexOutOfBoundsException("Enter valid index!");
        mList.set(index, element);
        return element;
    }
}
