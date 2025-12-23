package collection.threadSafeCollections;

import java.sql.Array;
import java.util.*;

public class ThreadSafeSpliterator {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
            set.add(i);
            map.put(i, i * 2);
            linkedHashSet.add(i);
            linkedHashMap.put(i, i * 2);
        }

        Spliterator<Integer> spArrayList = arr.spliterator();
        Spliterator<Integer> spHashSet = set.spliterator();
        Spliterator<Integer> spLinkedHashSet = linkedHashSet.spliterator();
        Spliterator<Integer> spHashMap = map.keySet().spliterator();

        Spliterator<Integer> spArrayList2 = spArrayList.trySplit(); // trySplit() method divide the spliterator into two halves// (first half items into new spliterator and remaining in older one)
        Spliterator<Integer> spArrayList3 = spArrayList.trySplit();
        Spliterator<Integer> spArrayList4 = spArrayList2.trySplit();
//
//        System.out.println(spHashSet.characteristics());
//        System.out.println(spArrayList.estimateSize());
//        System.out.println(spLinkedHashSet.hasCharacteristics(Spliterator.ORDERED));
//        System.out.println(spHashMap.getExactSizeIfKnown());

        System.out.println("sp2 Output:");
        spArrayList2.forEachRemaining(i -> System.out.println(i));

        System.out.println("sp1 Output:");
        spArrayList.forEachRemaining(i -> System.out.println(i));

        System.out.println("sp3 Output:");
        spArrayList3.forEachRemaining(i -> System.out.println(i));

        System.out.println("sp4 Output:");
        spArrayList4.forEachRemaining(i -> System.out.println(i));

    }
}
