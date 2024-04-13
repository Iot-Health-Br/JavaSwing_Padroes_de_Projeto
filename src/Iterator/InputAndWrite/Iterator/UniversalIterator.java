package Iterator.InputAndWrite.Iterator;

import javax.swing.JTextArea;

public class UniversalIterator {
    public static void iterateAndPrint(IteratorInterface model, JTextArea textArea) {
        java.util.Iterator<String> iterator = model.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }
}


