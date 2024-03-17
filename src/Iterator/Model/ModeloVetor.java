package Iterator.Model;

import Iterator.Iterator.IteratorInterface;

import javax.swing.*;
import java.util.Iterator;
import java.util.Queue;

public class ModeloVetor implements IteratorInterface {
    private String[] items; // Array de String com 50 posições
    private int itemCount; // Controla o número de itens adicionados
    public ModeloVetor() {
        this.items = new String[50]; // Inicializa o array com tamanho 50
        this.itemCount = 0; // Inicialmente, o storage está vazio
    }
    // Método para adicionar um item ao vetor, se houver espaço
    public boolean addWordVetor(String item) {
        if (itemCount < items.length) { // Usa length para o tamanho do array
            items[itemCount] = item;
            itemCount++;
            return true; // Item adicionado com sucesso
        } else {
            JOptionPane.showMessageDialog(null,"Storage is full. Cannot add more items.");
            return false; // Não foi possível adicionar o item pois o vetor está cheio
        }
    }
    // Método para obter o vetor de itens adicionados
    public String[] getlistVetor() {
        // Retorna uma cópia do array com apenas os itens adicionados
        String[] itemsCopy = new String[itemCount];
        System.arraycopy(items, 0, itemsCopy, 0, itemCount);
        return itemsCopy;
    }

    @Override
    public Iterator<String> createIterator() {
        return new Iterator<String>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < itemCount;
            }
            @Override
            public String next() {
                return items[currentIndex++];
            }
        };
    }
}
