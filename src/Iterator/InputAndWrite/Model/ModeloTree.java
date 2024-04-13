package Iterator.InputAndWrite.Model;

import Iterator.InputAndWrite.Iterator.IteratorInterface;

import javax.swing.*;
import java.util.Iterator;
import java.util.TreeSet;

public class ModeloTree  implements IteratorInterface{
    private TreeSet<String> tree;

    public ModeloTree() {
        this.tree = new TreeSet<>();
    }

    public void addWordTree(String word) {
        boolean added = tree.add(word);
        if (!added) {
            JOptionPane.showMessageDialog(null, "Palavra já existe: " + word);
        }
    }

    public TreeSet<String> getTree() {
        return tree;
    }

    // Método adicional para obter uma representação da árvore em uma String
    public String getTreeList() {
        StringBuilder builder = new StringBuilder();
        for (String word : tree) {
            builder.append(word).append("\n");
        }
        return builder.toString();
    }

    @Override
    public Iterator<String> createIterator() {
        // Retorna um iterador para os elementos do TreeSet
        return tree.iterator();
    }
}
