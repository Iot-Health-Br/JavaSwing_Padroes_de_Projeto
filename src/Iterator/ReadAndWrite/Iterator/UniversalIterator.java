package Iterator.ReadAndWrite.Iterator;

import Iterator.ReadAndWrite.Model.ModelHashMap;
import Iterator.InputAndWrite.Iterator.IteratorInterface;

import javax.swing.*;

public class UniversalIterator {
    public static void iterateAndPrint(ModelHashMap model, JTextArea textArea) {
        java.util.Iterator<String> iterator = model.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }

    public static void PilhaPrint(IteratorInterface model, JTextArea textArea) {
        java.util.Iterator<String> iterator = model.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }

    public static void ListaPrint(IteratorInterface model, JTextArea textArea) {
        java.util.Iterator<String> iterator = model.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }

    public static void VetorPrint(IteratorInterface model, JTextArea textArea) {
        java.util.Iterator<String> iterator = model.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }

    public static void TreePrint(IteratorInterface model, JTextArea textArea) {
        java.util.Iterator<String> iterator = model.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }
}