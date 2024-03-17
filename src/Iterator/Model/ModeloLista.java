package Iterator.Model;

import Iterator.Iterator.IteratorInterface;

import javax.swing.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ModeloLista implements IteratorInterface {

    //private Queue<String> lista;
    private Queue<String> words = new LinkedList<>();

    public void addWordLista(String word) {
        words.offer(word); // Adiciona a palavra ao final da fila
    }
    // Método para obter a fila completa de palavras
    public Queue<String> getLista() {
        return words;
    }

    @Override
    public Iterator<String> createIterator() {
        return words.iterator();
    }
}
