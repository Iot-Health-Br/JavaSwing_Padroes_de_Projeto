package FactoryMethod.Factory;

import FactoryMethod.Model.*;

public class ConcretaProdutoFactory extends ProdutoFactory {
    @Override
    public Produto criarProduto(String tipoProduto, String... propriedades) {
        switch (tipoProduto) {
            case "Livro":
                return new Livro(propriedades[0],
                        propriedades[1],
                        Double.parseDouble(propriedades[2]),
                        propriedades[3],
                        propriedades[4],
                        propriedades[5],
                        propriedades[6],
                        Integer.parseInt(propriedades[7]));
            case "Celular":
                return new Celular(propriedades[0],
                        propriedades[1],
                        Double.parseDouble(propriedades[2]),
                        propriedades[3],
                        propriedades[4],
                        Integer.parseInt(propriedades[5]),
                        propriedades[6],
                        propriedades[7]);
            case "Notebook":
                return new Notebook(
                        propriedades[0], // codigo
                        propriedades[1], // descricao
                        Double.parseDouble(propriedades[2]), // precoVenda
                        propriedades[3], // marca
                        propriedades[4], // modelo
                        propriedades[5], // memoriaRam
                        propriedades[6], // memoriaRom
                        propriedades[7], // processador
                        propriedades[8], // Tela
                        propriedades[9]  // SO
                );
            case "CD":
                return new CD(
                        propriedades[0], // codigo
                        propriedades[1], // descricao
                        Double.parseDouble(propriedades[2]), // precoVenda
                        propriedades[3], // ALBUM
                        propriedades[4], // BANDA
                        propriedades[5], // CANTOR
                        propriedades[6]  // GENERO
                );
            default:
                throw new IllegalArgumentException("Tipo de produto desconhecido.");
        }
    }
}

