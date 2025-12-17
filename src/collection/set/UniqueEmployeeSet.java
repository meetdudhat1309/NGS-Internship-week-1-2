package collection.set;


import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class UniqueEmployeeSet extends AbstractSet<Employee> {
    HashMap<Integer, Employee> map = new HashMap<>();

    @Override
    public Iterator<Employee> iterator() {
        return map.values().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean add(Employee employee) {
        if (!map.containsKey(employee.getId())) {
            map.put(employee.getId(), employee);
            return true;
        }
        return false;
    }

    public boolean remove(int id) {
        if (map.containsKey(id)){
            map.remove(id);
            return true;
        }
        return false;
    }

    public boolean contains(Employee o) {
        return map.containsKey(o.getId());
    }
}
