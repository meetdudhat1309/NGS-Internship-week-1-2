package collection.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        ListIterator<Integer> iterator = arrayList.listIterator();

        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);

        while (iterator.hasPrevious()) {
            int num = iterator.previous();
            if (num % 3 == 0) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);

        iterator.next();
        iterator.set(1309);

        System.out.println(arrayList);

    }
}
