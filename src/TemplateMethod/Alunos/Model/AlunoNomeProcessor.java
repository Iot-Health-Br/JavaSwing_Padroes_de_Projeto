package TemplateMethod.Alunos.Model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlunoNomeProcessor extends AlunoDataProcessor {

    @Override
    protected List<Aluno> filtrarDados(List<Aluno> alunos) {
        return alunos.stream()
                .sorted(Comparator.comparing(Aluno::getNome))
                .collect(Collectors.toList());
    }
}


