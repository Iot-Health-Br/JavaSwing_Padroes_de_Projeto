package Controller;

import Model.PrintModel;

import java.util.List;

public class PrintController {
    private PrintModel impressora;

    public PrintController() {
        impressora = PrintModel.getInstancia();
    }

    public void adicionarArquivo(String arquivo) {
        impressora.adicionarNaFila(arquivo);
    }

    public List<String> getFilaDeImpressao() {
        return impressora.getFilaDeImpressao();
    }
}


