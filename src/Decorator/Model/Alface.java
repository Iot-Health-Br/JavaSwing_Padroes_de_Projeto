package Decorator.Model;

import Decorator.Controller.IController;

public class Alface extends IngredienteDecorator {
    public Alface(IController sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montar() {
        return super.sanduiche.montar() + ", Alface";
    }
}