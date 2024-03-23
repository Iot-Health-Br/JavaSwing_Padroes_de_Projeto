package FactoryMethod.Model;

public class Notebook extends Produto {
    private String marca;
    private String modelo;
    private String memoriaRam;
    private String memoriaRom;
    private String processador;
    private String Tela;
    private String SO;


    public Notebook(String codigo, String descricao, double precoVenda, String marca, String modelo, String memoriaRam, String memoriaRom,
                    String processador, String Tela, String SO){
        super(codigo, descricao, precoVenda, "Notebook");
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.memoriaRom = memoriaRom;
        this.processador = processador;
        this.Tela = Tela;
        this.SO = SO;
    }

    @Override
    public String exibirInfo() {
        System.out.println("Código: " + codigo + ", Descrição: " + descricao + ", Preço: " + precoVenda);
        return null;
    }

    @Override
    public String toString() {
        return  "Código : " + codigo +
                "\n Descrição : " + descricao +
                "\n Preço de Venda : " + precoVenda +
                "\n Tipo : " + tipoProduto +
                "\n Marca : " + marca +
                "\n Modelo : " + modelo +
                "\n Memoria RAM : " + memoriaRam +
                "\n Memoria ROM : " + memoriaRom +
                "\n Processador : " + processador +
                "\n Tela : " + Tela +
                "\n SO : " + SO;
    }
}

