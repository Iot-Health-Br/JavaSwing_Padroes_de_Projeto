package FactoryMethod.Model;

import FactoryMethod.Factory.Personagem;

public class Guerreiro implements Personagem {
    @Override
    public String atacar() {

        return "O Guerreiro tem as Habilidades:\n"+
                "Ataque corpo a corpo\n"+
                "Ataque com espada\n"+
                "Atira com escudo\n";
    }
}

