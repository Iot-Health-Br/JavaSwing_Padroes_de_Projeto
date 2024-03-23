package FactoryMethod.View;

import FactoryMethod.Controller.Controller;
import FactoryMethod.Controller.IController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCelular {
    private JFormattedTextField Txt_Codigo;
    private JFormattedTextField Txt_Descricao;
    private JFormattedTextField Txt_PVenda;
    private JFormattedTextField Txt_Modelo;
    private JFormattedTextField Txt_Marca;
    private JTextArea Out_txt;
    private JButton Btn_Save;
    private JButton Btn_Voltar;
    private JFormattedTextField Txt_Memoria;
    private JFormattedTextField Txt_SO;
    private JFormattedTextField Txt_Tela;
    JPanel panelMain;
    private JFrame currentFrame; // Atributo para armazenar a referência ao JFrame atual

    public ViewCelular() {

        IController controller = new Controller();
        Btn_Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String produtoInfo = controller.cadastrarProduto("Celular",
                        Txt_Codigo.getText(),
                        Txt_Descricao.getText(),
                        Txt_PVenda.getText(),
                        Txt_Modelo.getText(),
                        Txt_Marca.getText(),
                        Txt_Memoria.getText(),
                        Txt_SO.getText(),
                        Txt_Tela.getText());
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
                ScreenManager.setupMainFrame("Tela de Cadastro Celular:");
                ScreenManager.showScreen(new ViewCelular().panelMain, "Tela de Cadastro Celular:");
            }
        });
    }

}
