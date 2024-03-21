package TemplateMethod.Model;

public class CafeSemAcucar extends PrepararCafe {
    @Override
    void misturarComCafe() {
        resultado.append("Adicione o café!\n");
    }

    @Override
    void adicionarAcucar() {
        resultado.append("");
    }

    @Override
    void adicionarCondimentos() {
        resultado.append("");
    }
}
