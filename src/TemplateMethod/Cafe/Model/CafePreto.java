package TemplateMethod.Cafe.Model;

public class CafePreto extends PrepararCafe {
    @Override
    void misturarComCafe() {
        resultado.append("Adicione café preto !\n");
    }

    @Override
    void adicionarAcucar() {
        resultado.append("Adicione açucar !\n");
    }

    @Override
    void adicionarCondimentos() {
        resultado.append("");
    }
}


