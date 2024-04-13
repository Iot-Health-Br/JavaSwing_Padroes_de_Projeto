package Iterator.ReadAndWrite.Controller;


import Iterator.ReadAndWrite.Model.*;

import javax.swing.*;

public class Controller implements IController {
    private ModelHashMap modelHashMap;
    private ModeloPilha modelPilha;
    private ModeloLista modelLista;
    private ModeloVetor modelVetor;
    private ModeloTree modelTree;

    public Controller(ModelHashMap modelHashMap) {
        this.modelHashMap = modelHashMap;
    }
    public Controller(ModeloPilha modelPilha) {
        this.modelPilha = modelPilha;
    }
    public Controller(ModeloLista modelLista) {
        this.modelLista = modelLista;
    }
    public Controller(ModeloVetor modelVetor) {
        this.modelVetor = modelVetor;
    }
    public Controller(ModeloTree modelTree) {
        this.modelTree = modelTree;
    }

    @Override
    public void addWordHashMap(String word) {
        modelHashMap.addWordHashMap(word, word);
    }
    ///Modelo Pilha
    @Override
    public void addWordPilha(String word) {
        modelPilha.addWordPilha(word);
    }
    ///Modelo Lista
    @Override
    public void addWordLista(String word) {
        modelLista.addWordLista(word);
    }
    ///Modelo Vetor
    @Override
    public void addWordVetor(String word) {
        modelVetor.addWordVetor(word);
    }
    ///Modelo Tree
    @Override
    public void addWordTree(String word) {
        modelTree.addWordTree(word);
    }

    @Override
    public void iterateAndPrint(JTextArea textArea) {
        java.util.Iterator<String> iterator = modelHashMap.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }
    @Override
    public void PilhaPrint(JTextArea textArea) {
        java.util.Iterator<String> iterator = modelPilha.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }

    @Override
    public void ListaPrint(JTextArea textArea) {
        java.util.Iterator<String> iterator = modelLista.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }

    @Override
    public void VetorPrint(JTextArea textArea) {
        java.util.Iterator<String> iterator = modelVetor.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }

    @Override
    public void TreePrint(JTextArea textArea) {
        java.util.Iterator<String> iterator = modelTree.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }
}






/*import javax.swing.*;
import java.util.Iterator;

public class Controller implements IController {







    @Override
    public void iterateAndPrint(JTextArea textArea) {
        java.util.Iterator<String> iterator = modelHashMap.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }

    @Override
    public void PilhaPrint(JTextArea textArea) {
        java.util.Iterator<String> iterator = modelPilha.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }
    }
}
*/