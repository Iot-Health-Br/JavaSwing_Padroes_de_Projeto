package Iterator.Model;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ModeloLista {
    private Queue<String> words = new LinkedList<>();

    public void addWordLista(String word) {
        words.offer(word); // Adiciona a palavra ao final da fila
        JOptionPane.showMessageDialog(null,"Palavra Digitada: "+ word);
    }
    // Método para obter a fila completa de palavras
    public Queue<String> getLista() {
        return words;
    }
}
