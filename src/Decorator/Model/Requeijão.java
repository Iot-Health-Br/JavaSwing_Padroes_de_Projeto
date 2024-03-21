package Decorator.Model;

import Decorator.Controller.IController;

public class Requeijão extends IngredienteDecorator {
    public Requeijão(IController sanduiche) {
        super(sanduiche);
    }

    @Override
    public String montar() {
        return super.sanduiche.montar() + ", Requeijão";
    }
}