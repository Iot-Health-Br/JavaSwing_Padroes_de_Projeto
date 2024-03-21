package FactoryMethod.Factory;

import FactoryMethod.Model.Arqueiro;
import FactoryMethod.Model.Cacador;
import FactoryMethod.Model.Guerreiro;
import FactoryMethod.Model.Mago;

public class FabricaDePersonagens {
    public Personagem criarPersonagem(String tipo) {
        switch (tipo) {
            case "guerreiro":
                return new Guerreiro();
            case "mago":
                return new Mago();
            case "arqueiro":
                return new Arqueiro();
            case "cacador":
                return new Cacador();
            default:
                throw new IllegalArgumentException("Tipo de personagem desconhecido.");
        }
    }
}

