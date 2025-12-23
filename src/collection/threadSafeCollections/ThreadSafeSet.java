package collection.threadSafeCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ThreadSafeSet {
    public static void main(String[] args) {
//        Same as CopyOnWriteArrayList, by the difference is that it stores the unique elements.
//        Set<Integer> set= new HashSet<>();
        CopyOnWriteArraySet<Integer> set= new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(5);
        System.out.println(set);

        for (int i: set){
            System.out.println("In loop: "+i);
            if (i == 2){
                set.add(6);
            }
        }

        System.out.println(set);

    }
}
