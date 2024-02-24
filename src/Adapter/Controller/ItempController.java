package Adapter.Controller;

// Define como o controller deverá agir.
public interface ItempController {
    // Define a temperatura em Celsius
    void setTemperature(double temperatureCelsius);

    //Retorna a temperatura em Kelvin
    double getTemperatureKelvin();
}

