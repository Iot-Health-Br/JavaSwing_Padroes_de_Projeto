package Decorator.Model;

import Decorator.Controller.IController;

public class Picles extends IngredienteDecorator {
    public Picles(IController sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montar() {
        return super.sanduiche.montar() + ", Picles";
    }
}
