package TemplateMethod.Alunos.Model;

public class Aluno {
    private String nome;
    private String curso;
    private String situacao;
    private String enfase;

    // Construtor
    public Aluno(String nome, String curso, String situacao, String enfase) {
        this.nome = nome;
        this.curso = curso;
        this.situacao = situacao;
        this.enfase = enfase;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEnfase() {
        return enfase;
    }

    public void setEnfase(String enfase) {
        this.enfase = enfase;
    }
}

