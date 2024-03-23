package FactoryMethod.Model;

public class CD extends Produto {
    private String album;
    private String banda;
    private String cantor;
    private String genero;


    public CD(String codigo, String descricao, double precoVenda, String album,
              String banda, String cantor, String genero){
        super(codigo, descricao, precoVenda, "CD");
        this.album = album;
        this.banda = banda;
        this.cantor = cantor;
        this.genero = genero;
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
                "\n Album : " + album +
                "\n Banda : " + banda +
                "\n Cantor : " + cantor +
                "\n Genero : " + genero;
    }
}
