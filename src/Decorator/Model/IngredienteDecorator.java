package Decorator.Model;

import Decorator.Controller.IController;

public abstract class IngredienteDecorator implements IController {
    protected IController sanduiche;

    public IngredienteDecorator(IController sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public abstract String montar();
}
