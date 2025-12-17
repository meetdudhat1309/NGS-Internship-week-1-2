package collection.set;

public class AbstractSetQ1 {
    public static void main(String[] args) {
        UniqueEmployeeSet set = new UniqueEmployeeSet();
        Employee a = new Employee(1,"A");
        set.add(a);
        set.add(new Employee(2,"B"));
        set.add(new Employee(3,"C"));
        for (Employee e: set){
            System.out.print(e);
            System.out.print(e.hashCode());
            System.out.println();
        }

        set.remove(1);
        System.out.println(set);

        System.out.println(set.contains(a));

    }
}
