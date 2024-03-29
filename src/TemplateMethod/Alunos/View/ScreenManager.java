package TemplateMethod.Alunos.View;

import javax.swing.*;

public class ScreenManager {
    private static JFrame mainFrame = new JFrame();

    public static void setupMainFrame(String title) {
        mainFrame.setTitle(title);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true); // Garante que a janela esteja visível.
    }

    public static void showScreen(JPanel panel, String title) {
        mainFrame.setTitle(title);
        mainFrame.setContentPane(panel);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Assegura que a janela seja maximizada ao mostrar uma nova tela.
        mainFrame.setVisible(true);
    }
}



