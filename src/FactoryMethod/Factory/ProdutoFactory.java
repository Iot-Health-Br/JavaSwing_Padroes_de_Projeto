package FactoryMethod.Factory;

import FactoryMethod.Model.Produto;

public abstract class ProdutoFactory {
    public abstract Produto criarProduto(String tipoProduto, String... propriedades);
}

