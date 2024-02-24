package Singleton.Controller;

import Singleton.Model.PrintModel;

import java.util.List;

public class PrintController {

    // Está variável é usada para acessar a instância PrintModel
    private PrintModel impressao;

    //Construtor da classe
    public PrintController() {
        /* Assegura que o PrintController esteja trabalhando com a mesma instância de PrintModel,
         mantendo a fila de impressão sincronizada e centralizada. */
        impressao = PrintModel.getInstancia();
    }

    /* Metodo que Adiciona um novo arquivo à fila de impressão. */
    public void adicionarArquivo(String arquivo) {
        impressao.adicionarNaFila(arquivo);
    }

    /* Este método retorna à lista de arquivos que estão aguardando para ser impressos */
    public List<String> getFilaDeImpressao() {
        return impressao.getFilaDeImpressao();
    }
}


