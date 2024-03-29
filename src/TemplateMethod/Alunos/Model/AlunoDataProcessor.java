package TemplateMethod.Alunos.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AlunoDataProcessor {

    public final List<Aluno> processarDados(String arquivo) {
        List<Aluno> alunos = lerDados(arquivo);
        return filtrarDados(alunos);
    }

    private List<Aluno> lerDados(String arquivo) {
        List<Aluno> alunos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 4) {
                    Aluno aluno = new Aluno(dados[0], dados[1], dados[2], dados[3]);
                    alunos.add(aluno);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    protected abstract List<Aluno> filtrarDados(List<Aluno> alunos);
}


