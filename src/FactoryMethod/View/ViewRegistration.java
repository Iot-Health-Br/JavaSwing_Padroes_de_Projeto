package FactoryMethod.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewRegistration {
    JPanel panelMain;
    private JButton Btn_TelaLivro;
    private JButton Btn_TelaCD;
    private JButton Btn_TelanNotebook;
    private JButton Btn_TelaCelular;


    public ViewRegistration() {


        Btn_TelaLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenManager.showScreen(new ViewBook().panelMain, "Tela de Cadastro Livro:");
            }
        });
        Btn_TelaCD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenManager.showScreen(new ViewCD().panelMain, "Tela de Cadastro CD:");
            }
        });
        Btn_TelanNotebook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenManager.showScreen(new ViewNotebook().panelMain, "Tela de Cadastro Notebook:");
            }
        });
        Btn_TelaCelular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenManager.showScreen(new ViewCelular().panelMain, "Tela de Cadastro Celular:");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ScreenManager.setupMainFrame("Tela de Cadastro:");
                ScreenManager.showScreen(new ViewRegistration().panelMain, "Tela de Cadastro:");
            }
        });
    }

}
