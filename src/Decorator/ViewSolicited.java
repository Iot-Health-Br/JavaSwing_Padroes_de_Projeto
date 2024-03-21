package Decorator;

import Decorator.Controller.Controller;
import Decorator.Controller.IController;
import Decorator.Model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewSolicited {
    private JPanel panelMain;
    private JTextArea Out_txt;
    private JCheckBox CB_Queijo;
    private JCheckBox CB_Presunto;
    private JButton Btn_Salvar;
    private JButton Btn_Clear;
    private JCheckBox CB_Alface;
    private JCheckBox CB_Tomate;
    private JCheckBox CB_Picles;
    private JCheckBox CB_Requeijão;

    IController sanduiche = new Controller();

    public ViewSolicited() {
        CB_Queijo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sanduiche = new Queijo(sanduiche);
            }
        });
        CB_Presunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sanduiche = new Presunto(sanduiche);
            }
        });
        Btn_Salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText(sanduiche.montar());
            }
        });
        Btn_Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sanduiche = new Controller(); // Reinicializa o pedido
                // Desmarca as checkboxes
                CB_Queijo.setSelected(false);
                CB_Presunto.setSelected(false);
                CB_Alface.setSelected(false);
                CB_Picles.setSelected(false);
                CB_Requeijão.setSelected(false);
                CB_Tomate.setSelected(false);
                // Limpa a área de texto
                Out_txt.setText("");
            }
        });
        CB_Alface.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sanduiche = new Alface(sanduiche);
            }
        });
        CB_Tomate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sanduiche = new Tomate(sanduiche);
            }
        });
        CB_Picles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sanduiche = new Picles(sanduiche);
            }
        });
        CB_Requeijão.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sanduiche = new Requeijão(sanduiche);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new ViewPrint();
                JFrame frame = new JFrame("Tela de Pedidos");
                frame.setContentPane(new ViewSolicited().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
