package FactoryMethod.Controller;

import FactoryMethod.Factory.FabricaDePersonagens;
import FactoryMethod.Factory.Personagem;

public class Controller implements IController {
    @Override
    public String processarEscolhaPersonagem(String tipo) {
        FabricaDePersonagens fabrica = new FabricaDePersonagens();
        Personagem personagem = fabrica.criarPersonagem(tipo);
        return personagem.atacar();
    }
}
