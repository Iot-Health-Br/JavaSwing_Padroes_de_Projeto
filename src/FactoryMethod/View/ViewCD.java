package FactoryMethod.View;

import FactoryMethod.Controller.Controller;
import FactoryMethod.Controller.IController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCD {

    JPanel panelMain;
    private JFormattedTextField Txt_Codigo;
    private JFormattedTextField Txt_Descricao;
    private JFormattedTextField Txt_PVenda;
    private JFormattedTextField Txt_Banda;
    private JFormattedTextField Txt_Cantor;
    private JTextArea Out_txt;
    private JButton Btn_Save;
    private JButton Btn_Voltar;
    private JFormattedTextField Txt_Genero;
    private JFormattedTextField Txt_Album;

    public ViewCD() {
        IController controller = new Controller();
        Btn_Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String produtoInfo = controller.cadastrarProduto("CD",
                        Txt_Codigo.getText(),
                        Txt_Descricao.getText(),
                        Txt_PVenda.getText(),
                        Txt_Album.getText(),
                        Txt_Banda.getText(),
                        Txt_Cantor.getText(),
                        Txt_Genero.getText());
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
                ScreenManager.setupMainFrame("Tela de Cadastro CD:");
                ScreenManager.showScreen(new ViewCD().panelMain, "Tela de Cadastro CD:");
            }
        });
    }
}
