package collection.list;

import java.util.List;

public class AbstractListQ1 {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C++"};
        List<String> list = new FixedSizedStringList(arr);

        System.out.println(list.get(1)); // Python
        System.out.println(list.size());
    }
}
