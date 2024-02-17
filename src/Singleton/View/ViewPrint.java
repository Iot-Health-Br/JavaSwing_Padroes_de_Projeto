package View;

import Controller.PrintController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.SwingUtilities;

public class ViewPrint {
    private JPanel panelMain;
    private JButton botaoAdicionar;
    private JButton botaoImprimir;
    private JList listaDeImpressao;
    private JButton botaoLimpar;
    private JButton botaoNovaTela;
    private PrintController controlador;
    private JFileChooser fileChooser;
    private File selectedFile;

    public ViewPrint() {
        // Uma nova instancia do controller
        controlador = new PrintController();

        /* Inicializa um modelo DefaultListModel<String> e exibe a listaDeImpressao na JList */
        DefaultListModel<String> modelo = new DefaultListModel<>();

        // Habilitar o botão de imprimir após a seleção do arquivo
        botaoImprimir.setEnabled(false);

        // Inativa o botão limpar JList
        botaoLimpar.setEnabled(false);

        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a seleção de arquivo no diretorio downloads
                fileChooser = new JFileChooser("C:/Users/igl_m/Downloads");
                // Permite apenas a seleção de arquivos
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                // Aceita apenas arquivos com extensões "jpg" ou "jpeg"
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Imagens JPG", "jpg", "jpeg"));

                // Se o usuário confirmar a escolha do arquivo procegue.
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    // Obtém o arquivo que o usuário selecionou.
                    selectedFile = fileChooser.getSelectedFile();

                    // Habilitar o botão de imprimir após a seleção do arquivo
                    botaoImprimir.setEnabled(true);
                    botaoLimpar.setEnabled(false);
                    // Adiciona o diretório do arquivo hà fila de impressão
                    // View => Controller ADD => Model ADD
                    //controlador.adicionarArquivo(selectedFile.getAbsolutePath());
                }
            }
        });

        botaoImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Inativo o botão imprimir e ativo o botão limpar
                botaoImprimir.setEnabled(false);
                botaoLimpar.setEnabled(true);

                // Limpa os dados da Jlist
                modelo.clear();

                // Adiciona o arquivo na lista de impressão
                if (selectedFile != null) {
                    controlador.adicionarArquivo(selectedFile.getAbsolutePath());

                    // Limpa o comando, eliminando o buffer de memória
                    selectedFile = null; // Isso "limpa" a referência ao arquivo, deixando a variável vazia
                }

                //Para cada arquivo na fila de impressão, o método modelo.addElement(arquivo) adiciona o arquivo na lista.
                // View => Controller GET => Model GET
                for (String arquivo : controlador.getFilaDeImpressao()) {
                    modelo.addElement(arquivo);
                }
                // Atualiza a lista de impressão
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
        botaoNovaTela.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a primeira janela JFrame (Tela de Impressão - 01)
                JFrame frame1 = new JFrame("Tela de Impressão - Filha");
                frame1.setContentPane(new ViewPrint().panelMain);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.pack();
                frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame1.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Abre a primeira janela JFrame (Tela de Impressão - 01)
                JFrame frame1 = new JFrame("Tela de Impressão - 01");
                frame1.setContentPane(new ViewPrint().panelMain);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.pack();
                frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame1.setVisible(true);

                // Abre a segunda janela JFrame (Tela de Impressão - 02)
                JFrame frame2 = new JFrame("Tela de Impressão - 02");
                frame2.setContentPane(new PrintView().panelMain2);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.pack();
                frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame2.setVisible(true);
            }
        });
    }
}
