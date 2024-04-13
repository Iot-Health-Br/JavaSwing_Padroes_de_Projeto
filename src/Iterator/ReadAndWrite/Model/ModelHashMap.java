package Iterator.ReadAndWrite.Model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ModelHashMap implements IteratorInterface {
    private Map<String, String> words = new HashMap<>();

    public void addWordHashMap(String key, String word) {
        words.put(key, word);
    }

    @Override
    public Iterator<String> createIterator() {
        return words.values().iterator();
    }
}

interface IteratorInterface {
    Iterator<String> createIterator();
}