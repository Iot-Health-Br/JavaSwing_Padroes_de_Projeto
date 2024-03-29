package TemplateMethod.Alunos.View;

import FactoryMethod.View.ScreenManager;
import TemplateMethod.Alunos.Model.Aluno;
import TemplateMethod.Alunos.Model.AlunoDataProcessor;
import TemplateMethod.Alunos.Model.AlunoNomeProcessor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ManageRegister {

    private JPanel panelMain;
    private JTable TableAlunos;
    private JButton Btn_Curso_Nome;
    private JButton Btn_Nome;
    private JButton Btn_Enfase_Nome;
    private JButton Btn_Situacao_Nome;
    private JButton ENFASECURSONOMEButton;

    public ManageRegister() {
        Btn_Nome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarTabela(new AlunoNomeProcessor());
            }
        });
        Btn_Curso_Nome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Btn_Situacao_Nome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Btn_Enfase_Nome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ENFASECURSONOMEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void atualizarTabela(AlunoDataProcessor processor) {
        List<Aluno> alunos = processor.processarDados("./src/TemplateMethod/Alunos/Arquivo/Aluno.txt");
        // Atualizar a JTable com os dados filtrados
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FactoryMethod.View.ScreenManager.setupMainFrame("Tela de Gerênciamento:");
                ScreenManager.showScreen(new ManageRegister().panelMain, "Tela de Gerênciamento:");
            }
        });
    }
}
