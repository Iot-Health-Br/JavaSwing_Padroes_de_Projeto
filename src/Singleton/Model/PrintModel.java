package Singleton.Model;

import java.util.List;
import java.util.LinkedList;

public class PrintModel {

    // irá armazenar a única instância da classe
    private static PrintModel instancia;

    // Atributo List que irá armazenar os arquivos a serem impressos.
    private List<String> filaDeImpressao;

    // Construtor Privado, o que significa que não é possível instanciar a classe PrintModel fora dela
    private PrintModel() {
        // Inicia uma nova instância de lista encadeada, para armazenar os arquivos da fila de impressão.
        filaDeImpressao = new LinkedList<>();
    }

    // Este método estático é sincronizado para garantir que apenas uma thread por vez possa executar este método.
    public static synchronized PrintModel getInstancia() {
        /* Se instancia é null, uma nova instância de PrintModel é criada e atribuída a instancia.
        Garante que apenas uma instância da classe seja criada durante a vida útil do aplicativo.*/
        if (instancia == null) {
            instancia = new PrintModel();
        }
        return instancia;
    }

    /* Este método adiciona um novo arquivo à fila de impressão.
    * Singleton.View ADD => Singleton.Controller ADD => Singleton.Model ADD*/
    public void adicionarNaFila(String arquivo) {
        // Add o arquivo a fila de impressão
        filaDeImpressao.add(arquivo);
    }

    /*Permite que outras partes do programa consulte quais arquivos estão aguardando para ser impressos.*/
    public List<String> getFilaDeImpressao() {
        return filaDeImpressao;
    }
}


