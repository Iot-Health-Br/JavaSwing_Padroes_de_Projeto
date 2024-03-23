package FactoryMethod.Controller;

import FactoryMethod.Factory.ConcretaProdutoFactory;
import FactoryMethod.Factory.ProdutoFactory;
import FactoryMethod.Model.Produto;

import javax.swing.*;

/*public class Controller implements IController {
    private ProdutoFactory produtoFactory;

    public Controller() {
        this.produtoFactory = new ConcretaProdutoFactory();
    }

    @Override
    public Produto cadastrarProduto(String tipoProduto, String... propriedades) {
        Produto produto = produtoFactory.criarProduto(tipoProduto, propriedades);
        produto.exibirInfo();
        // Aqui você pode adicionar a lógica para persistir o produto no banco de dados ou em outro meio de armazenamento
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        return produto;
    }
}*/

public class Controller implements IController {
    private ProdutoFactory produtoFactory;

    public Controller() {
        this.produtoFactory = new ConcretaProdutoFactory();
    }

    @Override
    public String cadastrarProduto(String tipoProduto, String... propriedades) {
        Produto produto = produtoFactory.criarProduto(tipoProduto, propriedades);
        // Supondo que cada Produto tenha um método toString que retorne suas informações
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        return produto.toString();
    }
}




