package TemplateMethod.Cafe.Model;

public class CafeCappuccino extends PrepararCafe {
    @Override
    void misturarComCafe() {
        resultado.append("Adicione café em pó !\n");
    }

    @Override
    void adicionarAcucar() {
        resultado.append("Adicione açucar !\n");
    }

    @Override
    void adicionarCondimentos() {
        resultado.append("Adicione leite em pó!\n");
        resultado.append("Adicione Chocolate em pó!\n");
        resultado.append("Misture os ingredientes\n");
    }
}
