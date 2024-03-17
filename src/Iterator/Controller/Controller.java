package Iterator.Controller;

import Iterator.Model.*;

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

    //Modelo HashMap
    @Override
    public void addWordHashMap(String word) {
        // Simplesmente adiciona a palavra ao modelo com uma chave que pode ser a própria palavra ou um identificador único.
        modelHashMap.addWordHashMap(word, word);}

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
}

