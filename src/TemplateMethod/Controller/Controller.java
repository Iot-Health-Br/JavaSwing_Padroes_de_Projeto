package TemplateMethod.Controller;

import TemplateMethod.Model.*;
import javax.swing.*;

public class Controller implements IController {
    private JTextArea textArea;
    public Controller(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void processarEscolha(String escolha) {
        PrepararCafe cafe = null;
        if ("cafe".equals(escolha)) {
            cafe = new CafePreto();} 
        else if("leite com cafe".equals(escolha)){
            cafe = new CafeComLeite();}
        else if("Sem Açucar".equals(escolha)){
            cafe = new CafeSemAcucar();}
        else if("Cafe Cappuccino".equals(escolha)){
            cafe = new CafeCappuccino();}
        
        cafe.prepararReceita();
        textArea.setText(cafe.getResultado());
    }
}




