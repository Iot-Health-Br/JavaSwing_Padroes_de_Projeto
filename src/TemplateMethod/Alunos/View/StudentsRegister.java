package TemplateMethod.Alunos.View;

import FactoryMethod.View.ScreenManager;
import TemplateMethod.Alunos.Controller.Controller;
import TemplateMethod.Alunos.Controller.IController;
import TemplateMethod.Alunos.Model.Aluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentsRegister {

    private JPanel panelMain;
    private JFormattedTextField Txt_Nome;
    private JFormattedTextField Txt_Curso;
    private JFormattedTextField Txt_Situação;
    private JFormattedTextField Txt_Enfase;
    private JButton Btn_Salvar;

    public StudentsRegister() {

        IController controller = new Controller();
        Btn_Salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aluno aluno = new Aluno(Txt_Nome.getText(), Txt_Curso.getText(), Txt_Situação.getText(), Txt_Enfase.getText());
                controller.salvarAluno(aluno);
                Limpar();
            }
        });
    }
    void Limpar(){
        Txt_Nome.setText("");
        Txt_Curso.setText("");
        Txt_Situação.setText("");
        Txt_Enfase.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FactoryMethod.View.ScreenManager.setupMainFrame("Tela de Cadastro:");
                ScreenManager.showScreen(new StudentsRegister().panelMain, "Tela de Cadastro:");
            }
        });
    }
}
