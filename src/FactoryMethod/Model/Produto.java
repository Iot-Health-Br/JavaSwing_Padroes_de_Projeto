package FactoryMethod.Model;

public abstract class Produto {
    protected String codigo;
    protected String descricao;
    protected double precoVenda;
    protected String tipoProduto;

    // Construtor
    public Produto(String codigo, String descricao, double precoVenda, String tipoProduto) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.tipoProduto = tipoProduto;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    // Método para exibição
    public abstract String exibirInfo();

    @Override
    public abstract String toString();

}

