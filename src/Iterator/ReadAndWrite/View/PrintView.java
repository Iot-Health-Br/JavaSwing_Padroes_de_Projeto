package Iterator.ReadAndWrite.View;

import Iterator.ReadAndWrite.Controller.Controller;
import Iterator.ReadAndWrite.Controller.IController;
import Iterator.ReadAndWrite.Iterator.UniversalIterator;
import Iterator.ReadAndWrite.Model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintView {
    private JPanel panelMain;
    private JButton Btn_LoadFromFile;
    private JButton Btn_clear;
    private JButton Btn_PrintHashMap;
    private JTextArea Out_txt;
    private JButton Btn_PrintLista;
    private JButton Btn_PrintPilha;
    private JButton Btn_PrintVetor;
    private JButton Btn_PrintTree;

    public PrintView() {
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

        Btn_LoadFromFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadFileToHashMap("./src/Iterator/Interator02/Arquivo/arquivo.txt", controllerHashMap);
                loadFileToPilha("./src/Iterator/Interator02/Arquivo/arquivo.txt", controllerPilha);
                loadFileToLista("./src/Iterator/Interator02/Arquivo/arquivo.txt", controllerLista);
                loadFileToVetor("./src/Iterator/Interator02/Arquivo/arquivo.txt", controllerVetor);
                loadFileToTree("./src/Iterator/Interator02/Arquivo/arquivo.txt", controllerTree);
            }
        });

        Btn_PrintHashMap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
                UniversalIterator.iterateAndPrint(modelHashMap, Out_txt);
            }
        });

        Btn_PrintPilha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
                UniversalIterator.PilhaPrint(modelPilha, Out_txt);
            }
        });
        Btn_PrintLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
                UniversalIterator.ListaPrint(modelLista, Out_txt);
            }
        });
        Btn_PrintVetor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
                UniversalIterator.VetorPrint(modeloVetor, Out_txt);
            }
        });
        Btn_PrintTree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
                UniversalIterator.TreePrint(modeloTree, Out_txt);
            }
        });


        Btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
            }
        });
    }

    private void loadFileToHashMap(String filePath, IController controller) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                controller.addWordHashMap(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void loadFileToPilha(String filePath, IController controller) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                controller.addWordPilha(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadFileToLista(String filePath, IController controller) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                controller.addWordLista(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadFileToVetor(String filePath, IController controller) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                controller.addWordVetor(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadFileToTree(String filePath, IController controller) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                controller.addWordTree(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Tela de Pesquisa");
                frame.setContentPane(new PrintView().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}


