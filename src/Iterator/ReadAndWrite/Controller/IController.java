package Iterator.ReadAndWrite.Controller;

import javax.swing.*;

public interface IController {
    void addWordHashMap(String palavra);
    void iterateAndPrint(JTextArea textArea);

    void addWordPilha(String palavra);
    void PilhaPrint(JTextArea textArea);

    void addWordLista(String palavra);
    void ListaPrint(JTextArea textArea);

    void addWordVetor(String palavra);
    void VetorPrint(JTextArea textArea);


    void addWordTree(String palavra);
    void TreePrint(JTextArea textArea);
}


