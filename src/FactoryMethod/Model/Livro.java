package FactoryMethod.Model;

public class Livro extends Produto {
    private String titulo;
    private String autor;
    private String tradutor;
    private String editora;
    private int anoPublicacao;

    public Livro(String codigo, String descricao, double precoVenda, String titulo, String autor, String tradutor, String editora, int anoPublicacao){
        super(codigo, descricao, precoVenda, "Livro");
        this.titulo = titulo;
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String exibirInfo() {
        System.out.println("Código: " + codigo + ", Descrição: " + descricao + ", Preço: " + precoVenda);
        System.out.println("Livro: " + descricao + ", Autor: " + autor + ", Editora: " + editora + ", Ano: " + anoPublicacao);
        return null;
    }

    @Override
    public String toString() {
        return  "Código : " + codigo +
                "\n Descrição : " + descricao +
                "\n Preço de Venda : " + precoVenda +
                "\n Tipo : " + tipoProduto +
                "\n Título : " + titulo +
                "\n Autor : " + autor +
                "\n Tradutor : " + tradutor +
                "\n Editora : " + editora +
                "\n Ano de Publicação : " + anoPublicacao;
    }
}
