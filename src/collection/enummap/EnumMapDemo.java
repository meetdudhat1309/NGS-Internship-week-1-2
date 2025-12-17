package collection.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<Month, Integer> map = new EnumMap<>(Month.class);
        map.put(Month.JAN, 31);
        map.put(Month.FEB, 28);
        map.put(Month.MAR, 31);
        map.put(Month.APR, 30);
        map.put(Month.MAY, 31);
        map.put(Month.JUN, 30);
        map.put(Month.JUL, 31);
        map.put(Month.AUG, 31);
        map.put(Month.SEP, 30);
        map.put(Month.OCT, 31);
        map.put(Month.NOV, 30);
        map.put(Month.DEC, 31);

        for (Map.Entry<Month, Integer> it : map.entrySet()) {
            System.out.println(it.getKey() + " has " + it.getValue() + " days");
        }

        System.out.println(map.get(Month.SEP));
    }
}
