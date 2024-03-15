package Iterator.Model;

import javax.swing.*;
import java.util.Queue;

public class ModeloVetor {
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
            JOptionPane.showMessageDialog(null,"Palavra Digitada: "+item);
            itemCount++;
            return true; // Item adicionado com sucesso
        } else {
            System.out.println("Storage is full. Cannot add more items.");
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
}
