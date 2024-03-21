package Decorator.Model;

import Decorator.Controller.IController;

public class Queijo extends IngredienteDecorator {
    public Queijo(IController sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montar() {
        return super.sanduiche.montar() + ", Queijo";
    }
}

