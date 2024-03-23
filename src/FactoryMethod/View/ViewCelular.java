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
    private JButton Btn_Limpar;
    private JFormattedTextField Txt_Memoria;
    private JFormattedTextField Txt_SO;
    private JFormattedTextField Txt_Tela;
    JPanel panelMain;

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
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new ViewPrint();
                JFrame frame = new JFrame("Tela de Cadastro Celular:");
                frame.setContentPane(new ViewCelular().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
