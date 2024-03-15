package Iterator.Model;

import javax.swing.*;
import java.util.Stack;

public class ModeloPilha {
    private Stack<String> pilha;

    public ModeloPilha() {
        this.pilha = new Stack<>();
    }

    public void addWordPilha(String palavra) {
        pilha.push(palavra);
        JOptionPane.showMessageDialog(null,"Palavra Digitada: "+palavra);
    }

    public Stack<String> getPilha() {
        return pilha;
    }
}

