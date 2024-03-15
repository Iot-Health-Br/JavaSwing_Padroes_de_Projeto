package Iterator.View;

import Iterator.Controller.IController;
import Iterator.Controller.Controller;
import Iterator.Iterator.CollectionAdapter;
import Iterator.Iterator.PilhaIterator;
import Iterator.Model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class WriteView {
    private JPanel panelMain;
    private JFormattedTextField In_txt;
    private JButton Btn_Save;
    private JButton Btn_clear;
    private JButton Btn_Print;
    private JTextArea Out_txt;
    private JButton Btn_SaveLista;
    private JButton Btn_PrintLista;
    private JButton Btn_SavePilha;
    private JButton Btn_PrintPilha;
    private JButton Btn_SaveVetor;
    private JButton Btn_PrintVetor;
    private JButton Btn_SaveTree;
    private JButton Btn_PrintTree;

    public WriteView() {

        Model model = new Model();
        IController controller = new Controller(model);

        //Pilha
        ModeloPilha modelPilha = new ModeloPilha();
        IController controllerPilha = new Controller(modelPilha);

        PilhaIterator pilhaIterator = new PilhaIterator(modelPilha);

        //Lista
        ModeloLista modelLista = new ModeloLista();
        IController controllerLista = new Controller(modelLista);

        //Vetor
        ModeloVetor modeloVetor = new ModeloVetor();
        IController controllerVetor = new Controller(modeloVetor);

        //Tree
        ModeloTree modeloTree = new ModeloTree();
        IController controllerTree = new Controller(modeloTree);

        Btn_Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = In_txt.getText();
                controller.addWordHashMap(word);
            }
        });
        Btn_Print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Iterator<String> iterator = model.getWordsIterator();
                while (iterator.hasNext()) {
                    Out_txt.append(iterator.next() + "\n");
                }
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

                // Iterando sobre a Pilha
                Out_txt.append("Iterando sobre Pilha:\n");
                while (pilhaIterator.hasNext()) {
                    Out_txt.append(pilhaIterator.next() + "\n");
                }
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
                Iterator<?> listaIterator = CollectionAdapter.getIterator(modelLista.getLista());
                while (listaIterator.hasNext()) {
                    Out_txt.append(listaIterator.next()+ "\n");
                }
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
                Iterator<?> listaIterator = CollectionAdapter.getIterator(modeloVetor.getlistVetor());
                while (listaIterator.hasNext()) {
                    Out_txt.append(listaIterator.next()+ "\n");
                }
            }
        });
        Btn_SaveTree.addActionListener(new ActionListener() {
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
