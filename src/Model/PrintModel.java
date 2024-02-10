package Model;

import java.util.List;
import java.util.LinkedList;

public class PrintModel {
    private static PrintModel instancia;
    private List<String> filaDeImpressao;

    private PrintModel() {
        filaDeImpressao = new LinkedList<>();
    }

    public static synchronized PrintModel getInstancia() {
        if (instancia == null) {
            instancia = new PrintModel();
        }
        return instancia;
    }

    public void adicionarNaFila(String arquivo) {
        filaDeImpressao.add(arquivo);
    }

    public List<String> getFilaDeImpressao() {
        return filaDeImpressao;
    }
}


