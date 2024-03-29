package TemplateMethod.Cafe.Model;


public class CafeComLeite extends PrepararCafe {
    @Override
    void misturarComCafe() {
        resultado.append("Adicione café !\n");
    }

    @Override
    void adicionarAcucar() {
        resultado.append("Adicione açucar !\n");
    }

    @Override
    void adicionarCondimentos() {
        resultado.append("Adicione leite !\n");
    }
}




