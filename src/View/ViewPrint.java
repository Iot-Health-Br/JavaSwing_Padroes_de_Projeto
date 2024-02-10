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
                    File selectedFile = fileChooser.getSelectedFile();

                    // Habilitar o botão de imprimir após a seleção do arquivo
                    botaoImprimir.setEnabled(true);
                    botaoLimpar.setEnabled(false);
                    // Adiciona o diretório do arquivo hà fila de impressão
                    // View => Controller ADD => Model ADD
                    controlador.adicionarArquivo(selectedFile.getAbsolutePath());
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
