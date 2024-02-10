package View;

import Controller.PrintController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ViewPrint {
    private JPanel panelMain;
    private JButton botaoAdicionar;
    private JButton botaoImprimir;
    private JList listaDeImpressao;
    private JButton botaoLimpar;
    private PrintController controlador;
    private JFileChooser fileChooser;

    public ViewPrint() {
        controlador = new PrintController();
        DefaultListModel<String> modelo = new DefaultListModel<>();

        // Habilitar o botão de adicionar após a seleção do arquivo
        botaoImprimir.setEnabled(false);
        botaoLimpar.setEnabled(false);


        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a escolha de arquivo no diretorio downloads
                fileChooser = new JFileChooser("C:/Users/igl_m/Downloads");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Imagens JPG", "jpg", "jpeg"));

                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();

                    // Habilitar o botão de adicionar após a seleção do arquivo
                    botaoImprimir.setEnabled(true);
                    botaoLimpar.setEnabled(false);
                    controlador.adicionarArquivo(selectedFile.getAbsolutePath());
                }
            }
        });

        botaoImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoImprimir.setEnabled(false);
                botaoLimpar.setEnabled(true);

                modelo.clear();
                for (String arquivo : controlador.getFilaDeImpressao()) {
                    modelo.addElement(arquivo);
                }
                listaDeImpressao.setModel(modelo);
            }
        });

        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.clear();
                botaoImprimir.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new ViewPrint();
                JFrame frame = new JFrame("Tela de Impressão");
                frame.setContentPane(new ViewPrint().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
