package collection.map;

import java.util.*;

public class SimpleCache extends AbstractMap<String, String> {
    List<Map.Entry<String, String>> cache = new ArrayList<>();

    @Override
    public Set<Entry<String, String>> entrySet() {
        return new AbstractSet<Entry<String, String>>() {
            @Override
            public Iterator<Entry<String, String>> iterator() {
                return cache.iterator();
            }

            @Override
            public int size() {
                return cache.size();
            }
        };
    }

    @Override
    public String put(String key, String value) {
        for (Map.Entry<String, String> e: cache){
            if (Objects.equals(e.getKey(), key)){
                e.setValue(value);
                return value;
            }
        }
        cache.add(new AbstractMap.SimpleEntry<>(key,value));
        return null;
    }

    @Override
    public String get(Object key) {
        for (Map.Entry<String, String> e: cache){
            if (Objects.equals(key, e.getKey())){
                return e.getValue();
            }
        }
        return null;
    }

    @Override
    public String remove(Object key) {
        Iterator<Map.Entry<String, String>> iterator = cache.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();

            if (Objects.equals(entry.getKey(), key)){
                String val = entry.getValue();
                iterator.remove();
                return val;
            }
        }
        return null;
    }
}
