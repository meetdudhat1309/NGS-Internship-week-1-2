package collection.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Fail-fast: it will throw ConcurrentModificationException immediately after creation of iterator if modification is done on data.
//Fail-safe it will not throw an exception because it works on a copy of iterator instead of actual one.
public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numList.add(i);
        }

        System.out.println(numList);
        Iterator<Integer> it = numList.iterator();
        while (it.hasNext()){
            int num = it.next();
            if (num%2==0){
                it.remove();
            }
        }
        System.out.println(numList);
    }
}
