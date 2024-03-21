package Decorator.Controller;

public class SanduicheBasico implements SanduicheComponent {
    @Override
    public String montar() {
        return "Pão";
    }
}

