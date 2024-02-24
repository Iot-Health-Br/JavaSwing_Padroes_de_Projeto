package Adapter.Model;

public class TemperatureModel {
    private TemperatureConverter converter;

    public TemperatureModel(TemperatureConverter converter) {
        this.converter = converter;
    }

    public double convertTemperature(double temperature) {
        return converter.convert(temperature);
    }
}

