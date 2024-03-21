package FactoryMethod.Model;

import FactoryMethod.Factory.Personagem;

public class Cacador implements Personagem {
    @Override
    public String atacar() {
        return "O Cacador tem as Habilidades:\n"+
                "Atira Flecha\n"+
                "Atira Adaga\n"+
                "Ataque com espada\n";
    }
}
