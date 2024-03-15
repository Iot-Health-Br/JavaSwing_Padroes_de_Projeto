package Iterator.Iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import javax.swing.JOptionPane;

public class CollectionAdapter {
    public static Iterator<?> getIterator(Object model) {
        // Checagem para Stack especificamente, pois ModeloPilha usa Stack
        if (model instanceof Stack) {
            // Convertendo a pilha em um iterador
            Stack<?> stack = (Stack<?>) model;
            // Inverte a pilha para iterar do início ao fim
            Stack<?> stackClone = (Stack<?>) stack.clone();
            Iterator<?> iterator = new Iterator<>() {
                @Override
                public boolean hasNext() {
                    return !stackClone.isEmpty();
                }

                @Override
                public String next() {
                    return stackClone.pop().toString();
                }
            };
            return (Iterator<String>) iterator;
        } else if (model instanceof Collection) {
            // Para qualquer outro tipo de Collection
            return ((Collection<?>) model).iterator();
        } else {
            // Lançar uma exceção ou lidar com não coleções
            JOptionPane.showMessageDialog(null, "Tipo de dado não suportado para iteração.");
            return null; // ou uma coleção vazia/iterador vazio como fallback
        }
    }
}

