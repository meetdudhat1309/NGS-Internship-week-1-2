package collection.set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetInterfaceMain {
    public static void main(String[] args) {
//        ***********************************************************************************************
//        Used when we want to create our own custom set implementation
        AbstractSetDemo abstractSetDemo = new AbstractSetDemo(); // same as AbstractList but for Set, we have to override iterator() and size() at least
        System.out.println(abstractSetDemo.contains(2));
        abstractSetDemo.add(2); // throws an exception as we not override its implementation

//        ***********************************************************************************************
//        the elements of the set are kept sorted according to their natural ordering or provided Comparator
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

//        ***********************************************************************************************
//        Thread safe for operations like add, set, remove etc.,
        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>(); // same as CopyOnWriteArrayList

//        ***********************************************************************************************
//        Set implementation for Enum types, iterator method traverse in their natural order (the order in which the enum constants are declared), null elements are not permitted, not thread safe
//        We can make it synchronous by using Collections.synchronizedSet(java.util.Set<T>)
        EnumSet<Days> enumSet = EnumSet.allOf(Days.class);

//        ***********************************************************************************************
//        Not synchronized, Unordered, allows one null, no duplicate
        HashSet<Integer> hashSet = new HashSet<>();

//        ***********************************************************************************************
//        Not synchronized, ordered(in which they are inserted), allow null
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

//        ***********************************************************************************************
//        Not synchronized, ordered(insert order or Comparator specified)
        TreeSet<Integer> treeSet = new TreeSet<>();

    }
}

enum Days {
    MON, TUE, WED, THU, FRI, SAT, SUN
}