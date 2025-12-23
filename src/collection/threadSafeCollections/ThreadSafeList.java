package collection.threadSafeCollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeList {
    public static void main(String[] args) {
//        Used when multiple thread manipulating data of a list, when the user want to update
//        some data then it will create copy of original list and apply updates on copied list
//        and when the update completed then copied list is assigned to the original one so that
//        reader of the list get data consistent while other updating it.
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>(); // in this case it throws exception
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        for (int i: list){
            System.out.println(i);
            if (i == 3){
                list.add(6);
                System.out.println("Add 6 while reading");
            }
        }
        System.out.println(list);
    }
}
