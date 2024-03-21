package Decorator.Model;

import Decorator.Controller.IController;

public class Presunto extends IngredienteDecorator {
    public Presunto(IController sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montar() {
        return super.sanduiche.montar() + ", Presunto";
    }
}

