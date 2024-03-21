package FactoryMethod;

import FactoryMethod.Controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewSelect {
    private JPanel panelMain;
    private JCheckBox CB_Guerreiro;
    private JCheckBox CB_Arqueiro;
    private JCheckBox CB_Mago;
    private JCheckBox CB_Cacador;
    private JButton Btn_Limpar;
    private JTextArea Out_txt;
    private JButton Btn_Salvar;
    private Controller controller;

    String tipo = "";
    public ViewSelect() {

        controller = new Controller();
        CB_Guerreiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = "guerreiro";
            }
        });
        CB_Mago.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = "mago";
            }
        });
        CB_Arqueiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = "arqueiro";
            }
        });
        CB_Cacador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = "cacador";
            }
        });
        Btn_Salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultado = controller.processarEscolhaPersonagem(tipo);
                Out_txt.setText(resultado);
            }
        });
        Btn_Limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Desmarca as checkboxes
                CB_Guerreiro.setSelected(false);
                CB_Arqueiro.setSelected(false);
                CB_Cacador.setSelected(false);
                CB_Mago.setSelected(false);
                // Limpa a área de texto
                Out_txt.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new ViewPrint();
                JFrame frame = new JFrame("Tela de Personagens!");
                frame.setContentPane(new ViewSelect().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
