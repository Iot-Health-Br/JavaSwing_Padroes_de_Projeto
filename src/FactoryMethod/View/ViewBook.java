package FactoryMethod.View;

import FactoryMethod.Controller.Controller;
import FactoryMethod.Controller.IController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewBook {
    JPanel panelMain;
    private JFormattedTextField Txt_Codigo;
    private JFormattedTextField Txt_Descricao;
    private JFormattedTextField Txt_PVenda;
    private JFormattedTextField Txt_Autor;
    private JFormattedTextField Txt_Tradutor;
    private JTextArea Out_txt;
    private JButton Btn_Save;
    private JButton Btn_Voltar;
    private JFormattedTextField Txt_Editora;
    private JFormattedTextField Txt_Ano;
    private JFormattedTextField Txt_Titulo;

    public ViewBook() {
        IController controller = new Controller();
        Btn_Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String produtoInfo = controller.cadastrarProduto("Livro",
                        Txt_Codigo.getText(),
                        Txt_Descricao.getText(),
                        Txt_PVenda.getText(),
                        Txt_Titulo.getText(),
                        Txt_Autor.getText(),
                        Txt_Tradutor.getText(),
                        Txt_Editora.getText(),
                        Txt_Ano.getText());
                Out_txt.setText(produtoInfo);
            }
        });
        Btn_Voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenManager.showScreen(new ViewRegistration().panelMain, "Tela de Cadastro:");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ScreenManager.setupMainFrame("Tela de Cadastro Livros:");
                ScreenManager.showScreen(new ViewBook().panelMain, "Tela de Cadastro Livros:");
            }
        });
    }
}
