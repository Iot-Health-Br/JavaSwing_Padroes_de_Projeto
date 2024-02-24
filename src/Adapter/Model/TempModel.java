package Adapter.Model;

import javax.swing.*;

public class TempModel {
    // Atributo da Temperatura
    private double Celsius;

    //Get e Set da Temperatura
    public double getCelsius() {
        return Celsius;
    }

    public void setCelsius(double celsius) {
        this.Celsius = celsius;
        // Teste para ver se o dado está chegando no Modelo
        JOptionPane.showMessageDialog(null, "Valor"+celsius);
    }
}

