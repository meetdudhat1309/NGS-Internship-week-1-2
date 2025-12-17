package collection.list;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.relation.Role;
import javax.management.relation.RoleList;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListInterfaceMain {
    public static void main(String[] args) {
//        ***********************************************************************************************
//        Used when we want to create our own list implementation by overriding different method (we have to override get(int idx) and size() at least compulsory)
//        Limit the list functionalities - worked as simple list
//        AbstractListDemo abstractListDemo = new AbstractListDemo();
//        abstractListDemo.add(4); // If we not override the method then it throws an Exception(UnsupportedOperationException)
//        System.out.println(abstractListDemo);

//        ***********************************************************************************************
//        same as AbstractList but the difference is that it works with sequential access using listIterator (we have to provide implementation of listIterator and size methods)
//        AbstractSequentialListDemo abstractSequentialListDemo = new AbstractSequentialListDemo();

//        ***********************************************************************************************
//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(11, 13, 15, 17, 19, 12, 14, 16, 18, 20));
//        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(12, 14, 16, 18, 20));
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Object copy = arrayList.clone(); // used to clone the list
//        System.out.println(copy);
//        System.out.println(arrayList.size());
//        arrayList.ensureCapacity(20); // increase the capacity of arraylist instance, it can hold at least the number of ele specified by minCapacity
//        System.out.println(arrayList.size());
//        arrayList.removeIf(a-> a%2==0); // conditional removal
//        System.out.println(arrayList);
//        arrayList.retainAll(arrayList2); //retain only elements which is present in both
//        System.out.println(arrayList);
//        arrayList.sort(Comparator.reverseOrder()); //sort in reverse order

//        ***********************************************************************************************
//        It is arrayList of Attribute class which(Attribute()) is used to store key value pair - only accept Attribute
//        AttributeList attributeList = new AttributeList();
//        attributeList.add(new Attribute("Key", "value"));
//        attributeList.add(new Attribute("Key", 13));
//        System.out.println(attributeList);

//        ***********************************************************************************************
//        Thread safe version of ArrayList for the operations like add, set - implemented by making fresh copy of underlying array.
//        When multiple threads are trying to update or manipulate data of list then it will perform operation without throwing ConcurrentModificationException
//        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>(Arrays.asList(2,3,4));
//        copyOnWriteArrayList.addAllAbsent(Arrays.asList(1,2,3)); // add the element which is absent in the copyOnWriteArrayList
//        copyOnWriteArrayList.addIfAbsent(5);
//        copyOnWriteArrayList.addIfAbsent(2); //will not add because it is present in the list
//        System.out.println(copyOnWriteArrayList);
//        copyOnWriteArrayList.removeAll(Arrays.asList(2,8));
//        System.out.println(copyOnWriteArrayList);
//        copyOnWriteArrayList.removeIf(it->it>4);
//        System.out.println(copyOnWriteArrayList);

//        ***********************************************************************************************
//        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(2,4,6));
        //offer(add at the end) and poll(remove from the start)
        //add(add at the end) and remove(remove from the start)
        //push(add at the start) and pop(remove from the start)
//        System.out.println(linkedList); // 2,4,6
//        linkedList.offer(1); // add element at the end of the list
//        System.out.println(linkedList); // 2,4,6,1
//        linkedList.poll(); // remove element from start of the list
//        System.out.println(linkedList); // 4,6,1
//        linkedList.push(3); // add element at the start of the list
//        System.out.println(linkedList); // 3,4,6,1
//        linkedList.pop(); // remove element from start
//        System.out.println(linkedList); // 4,6,1
//        Integer m = linkedList.peek();
//        System.out.println(m);
//        System.out.println(linkedList);
//        System.out.println(linkedList.peek()); // 4
//        System.out.println(linkedList.peekFirst()); // 4
//        System.out.println(linkedList.peekLast()); // 1
//        linkedList.add(9); // 4,6,1,9
//        System.out.println(linkedList);
//        linkedList.remove(); // 6,1,9
//        System.out.println(linkedList);

//        ***********************************************************************************************
//        Stack<Integer> stack = new Stack<>(); // Last In First Out
//        stack.push(1);
//        stack.push(2);
//        System.out.println(stack);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);

//        ***********************************************************************************************
//        Vector(double its size) is thread safe, meanwhile ArrayList(increase size by 50%) is not
//        CopyOnWriteArrayList is alternative of Vector
        Vector<Integer> vector = new Vector<>(); // same as ArrayList

//        ***********************************************************************************************


    }
}
