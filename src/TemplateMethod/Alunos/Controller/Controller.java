package TemplateMethod.Alunos.Controller;
import TemplateMethod.Alunos.Model.Aluno;

import javax.swing.*;
import java.io.BufferedWriter;
        import java.io.FileWriter;
        import java.io.IOException;

public class Controller implements IController {
    private static final String ARQUIVO = "./src/TemplateMethod/Alunos/Arquivo/Aluno.txt";

    @Override
    public void salvarAluno(Aluno aluno) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            bw.write(aluno.getNome() + ";" + aluno.getCurso() + ";" + aluno.getSituacao() + ";" + aluno.getEnfase());
            bw.newLine();
            JOptionPane.showMessageDialog(null, "Aluno salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Aluno!");
        }
    }
}
