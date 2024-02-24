package Adapter.Service;

import Adapter.Model.TempModel;

public class CelsiusToKelvinAdapter implements TempAdapter {
    private TempModel model;

    /*O construtor recebe um TempModel como parâmetro e o atribui a model.
     Isso significa que para criar um CelsiusToKelvinAdapter, você precisa fornecer um TempModel,
     que é onde a temperatura em Celsius é armazenada.*/
    public CelsiusToKelvinAdapter(TempModel model) {
        this.model = model;
    }

    /*Obtem de model.getCelsius() e adiciona 273.15, e retorna o resultado.
    Conforme exigido pela interface.*/
    @Override
    public double getTemperatureKelvin() {
        return model.getCelsius() + 273.15;
    }
}

