package FactoryMethod.Model;

public class Celular extends Produto {
    private String modelo;
    private String marca;
    private int memoria;
    private String sistemaOperacional;
    private String tela;

    public Celular(String codigo, String descricao, double precoVenda, String modelo, String marca, int memoria, String sistemaOperacional, String tela) {
        super(codigo, descricao, precoVenda, "Celular");
        this.modelo = modelo;
        this.marca = marca;
        this.memoria = memoria;
        this.sistemaOperacional = sistemaOperacional;
        this.tela = tela;
    }

    @Override
    public String exibirInfo() {
        System.out.println("Código: " + codigo + ", Descrição: " + descricao + ", Preço: " + precoVenda);
        System.out.println("Celular: " + modelo + ", Marca: " + marca + ", SO: " + sistemaOperacional);
        return null;
    }

    @Override
    public String toString() {
        return  "Código : " + codigo +
                "\n Descrição : " + descricao +
                "\n Preço de Venda : " + precoVenda +
                "\n Tipo : " + tipoProduto +
                "\n Modelo : " + modelo +
                "\n Marca : " + marca +
                "\n Memória : " + memoria +
                "\n SO : " + sistemaOperacional +
                "\n Tela : " + tela;
    }

}
