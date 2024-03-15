package Iterator.Model;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Model {
    private Map<String, String> words = new HashMap<>();

    public void addWordHashMap(String key, String word) {
        words.put(key, word);
        JOptionPane.showMessageDialog(null,"Palavra Digitada: "+word);
    }
    public String getWord(String key) {
        return words.get(key);
    }

    public Iterator<String> getWordsIterator() {
        return words.values().iterator();
    }
}

