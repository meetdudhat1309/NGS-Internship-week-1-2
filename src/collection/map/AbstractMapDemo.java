package collection.map;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;

public class AbstractMapDemo extends AbstractMap<String, Integer> {
    @Override
    public Set<Entry<String, Integer>> entrySet() {
        return Collections.emptySet();
    }
}
