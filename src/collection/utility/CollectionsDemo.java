package collection.utility;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,7,4,2,6,9,5,3,2,8,6,4,5));

//        Sorting and Reversing a List
        Collections.sort(list);
//        System.out.println(list);
//        Collections.reverse(list);
        System.out.println(list);

//        Finding Min, Max and Frequency
//        int min = Collections.min(list);
//        int max = Collections.max(list);
//        int freq = Collections.frequency(list, 5);
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(freq);

//        Searching
//        int idx = Collections.binarySearch(list, 5);
//        System.out.println(idx);

//        Making Collection Thread safe
        List<Integer> syncList = Collections.synchronizedList(list);

        List<Integer> unmodifiable = Collections.unmodifiableList(list);
        List<Integer> emptyList = Collections.emptyList();





    }
}
