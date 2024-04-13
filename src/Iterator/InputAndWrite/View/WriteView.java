package Iterator.InputAndWrite.View;

import Iterator.InputAndWrite.Controller.Controller;
import Iterator.InputAndWrite.Controller.IController;
import Iterator.InputAndWrite.Iterator.UniversalIterator;
import Iterator.InputAndWrite.Model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WriteView {
    private JPanel panelMain;
    private JFormattedTextField In_txt;
    private JButton Btn_SaveHashMap;
    private JButton Btn_clear;
    private JButton Btn_PrintHashMap;
    private JTextArea Out_txt;
    private JButton Btn_SaveLista;
    private JButton Btn_PrintLista;
    private JButton Btn_SavePilha;
    private JButton Btn_PrintPilha;
    private JButton Btn_SaveVetor;
    private JButton Btn_PrintVetor;
    private JButton Btn_LoadFromFile;
    private JButton Btn_PrintTree;

    public WriteView() {

        //HashMap
        ModelHashMap modelHashMap = new ModelHashMap();
        IController controllerHashMap = new Controller(modelHashMap);

        //Pilha
        ModeloPilha modelPilha = new ModeloPilha();
        IController controllerPilha = new Controller(modelPilha);

        //Lista
        ModeloLista modelLista = new ModeloLista();
        IController controllerLista = new Controller(modelLista);

        //Vetor
        ModeloVetor modeloVetor = new ModeloVetor();
        IController controllerVetor = new Controller(modeloVetor);

        //Tree
        ModeloTree modeloTree = new ModeloTree();
        IController controllerTree = new Controller(modeloTree);

        Btn_SaveHashMap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = In_txt.getText();
                controllerHashMap.addWordHashMap(word);
                In_txt.setText("");
            }
        });
        Btn_PrintHashMap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
                UniversalIterator.iterateAndPrint(modelHashMap, Out_txt);
            }
        });
        Btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
            }
        });


        /// Botão Pilha
        Btn_SavePilha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = In_txt.getText();
                controllerPilha.addWordPilha(word);
                In_txt.setText("");
            }
        });
        Btn_PrintPilha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
                UniversalIterator.iterateAndPrint(modelPilha, Out_txt);
            }
        });


        //Botão Lista
        Btn_SaveLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = In_txt.getText();
                controllerLista.addWordLista(word);
                In_txt.setText("");
            }
        });
        Btn_PrintLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UniversalIterator.iterateAndPrint(modelLista, Out_txt);
            }
        });


        //Botão Vetor
        Btn_SaveVetor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = In_txt.getText();
                controllerVetor.addWordVetor(word);
                In_txt.setText("");
            }
        });
        Btn_PrintVetor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
                UniversalIterator.iterateAndPrint(modeloVetor, Out_txt);
            }
        });


        //Botão Tree
        Btn_LoadFromFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = In_txt.getText();
                controllerTree.addWordTree(word);
                In_txt.setText("");
            }
        });
        Btn_PrintTree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
                UniversalIterator.iterateAndPrint(modeloTree, Out_txt);
            }
        });

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new ViewPrint();
                JFrame frame = new JFrame("Tela de Pesquisa");
                frame.setContentPane(new WriteView().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
