package FactoryMethod.Model;

import FactoryMethod.Factory.Personagem;

public class Arqueiro implements Personagem {
    @Override
    public String atacar() {
        return "O Arqueiro tem as Habilidades:\n"+
                "Atira flechas!\n"+
                "Atira Adagas\n";
    }
}
