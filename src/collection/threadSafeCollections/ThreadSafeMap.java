package collection.threadSafeCollections;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeMap {
    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>(); // throws ConcurrentModificationException
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
//        Hashtable<String, Integer> map = new Hashtable<>(); // it is thread safe but not for iteration
        map.put("Jan", 31);
        map.put("Feb", 28);
        map.put("Mar", 31);
        map.put("Apr", 30);
        map.put("May", 31);
        map.put("Jun", 30);

        for (Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println("Inside loop: "+e.getKey()+" : "+ e.getValue());
            if (e.getKey().equals("May")){
                map.put("Jul", 31);
                map.put("Aug", 31);
            }
        }
        System.out.println(map);

    }
}
