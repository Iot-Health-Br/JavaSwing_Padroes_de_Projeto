package FactoryMethod.Model;

import FactoryMethod.Factory.Personagem;

public class Mago implements Personagem {
    @Override
    public String atacar() {
        return "O Mago tem as Habilidades:\n"+
                "Ataque com fentiço\n"+
                "Ataque com Cajado\n"+
                "Ataque a distância\n";
    }
}

