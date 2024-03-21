package TemplateMethod.Model;

public abstract class PrepararCafe {
    StringBuilder resultado = new StringBuilder();

    public final void prepararReceita() {
        ferverAgua();
        misturarComCafe();
        adicionarAcucar();
        mexa();
        coar();
        colocarEmCopo();
        adicionarCondimentos();
        beba();
    }

    abstract void misturarComCafe();
    abstract void adicionarAcucar();
    abstract void adicionarCondimentos();

    void ferverAgua() {
        resultado.append("Ferva a água !\n");
    }
    private void mexa() {
        resultado.append("Mexa bem !\n");
    }
    private void coar() {
        resultado.append("Coe o café !\n");
    }
    void colocarEmCopo() {
        resultado.append("Coloque no copo\n");
    }
    void beba(){
        resultado.append("Agora Beba !\n");
    }

    public String getResultado() {
        return resultado.toString();
    }
}


