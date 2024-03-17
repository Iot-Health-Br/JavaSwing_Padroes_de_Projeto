package Iterator.Model;

import Iterator.Iterator.IteratorInterface;

import javax.swing.*;
import java.util.Iterator;
import java.util.Stack;

public class ModeloPilha implements IteratorInterface {
    private Stack<String> pilha;

    public ModeloPilha() {
        this.pilha = new Stack<>();
    }

    public void addWordPilha(String palavra) {
        pilha.push(palavra);
    }

    public Stack<String> getPilha() {
        return pilha;
    }

    @Override
    public Iterator<String> createIterator() {
        return pilha.iterator();
    }
}

