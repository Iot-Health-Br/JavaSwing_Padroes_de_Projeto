package Iterator.InputAndWrite.Model;

import Iterator.InputAndWrite.Iterator.IteratorInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ModelHashMap implements IteratorInterface {
    private Map<String, String> words = new HashMap<>();

    public void addWordHashMap(String key, String word) {
        words.put(key, word);
    }
    public String getWord(String key) {
        return words.get(key);
    }

    @Override
    public Iterator<String> createIterator() {
        // Retorna um iterador para os valores do HashMap
        return words.values().iterator();
    }
}

