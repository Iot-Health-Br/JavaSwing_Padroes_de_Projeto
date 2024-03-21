package Decorator.Model;

import Decorator.Controller.IController;

public class Tomate extends IngredienteDecorator {
    public Tomate(IController sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montar() {
        return super.sanduiche.montar() + ", Tomate";
    }
}