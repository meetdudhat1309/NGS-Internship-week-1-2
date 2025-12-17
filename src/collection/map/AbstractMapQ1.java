package collection.map;

import java.util.Map;

public class AbstractMapQ1 {
    public static void main(String[] args) {
        SimpleCache cache = new SimpleCache();
        cache.put("A", "Z");
        cache.put("B", "Y");
        cache.put("C", "X");
        for (Map.Entry<String, String> c: cache.entrySet()) {
            System.out.print(c.getValue());
        }
        System.out.println();
        cache.put("B","M");
        for (Map.Entry<String, String> c: cache.entrySet()) {
            System.out.print(c.getValue());
        }
        System.out.println();

        System.out.println(cache.get("B"));
        System.out.println(cache);
        cache.remove("C");
        System.out.println(cache);

    }
}
