package FactoryMethod.Factory;

import FactoryMethod.Model.Celular;
import FactoryMethod.Model.Livro;
import FactoryMethod.Model.Produto;

public class ConcretaProdutoFactory extends ProdutoFactory {
    @Override
    public Produto criarProduto(String tipoProduto, String... propriedades) {
        switch (tipoProduto) {
            case "Livro":
                return new Livro(propriedades[0], propriedades[1], Double.parseDouble(propriedades[2]), propriedades[3], propriedades[4], propriedades[5], propriedades[6], Integer.parseInt(propriedades[7]));
            case "Celular":
                return new Celular(propriedades[0], propriedades[1], Double.parseDouble(propriedades[2]), propriedades[3], propriedades[4], Integer.parseInt(propriedades[5]), propriedades[6], propriedades[7]);
            default:
                throw new IllegalArgumentException("Tipo de produto desconhecido.");
        }
    }
}

