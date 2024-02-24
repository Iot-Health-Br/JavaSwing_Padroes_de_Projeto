package Adapter.Controller;

import Adapter.Model.TempModel;
import Adapter.Service.CelsiusToKelvinAdapter;

public class TempController implements ItempController{

    /* O uso do adaptador, e para que o sistema tenha diferentes formas de calcular ou representar temperaturas*/
    private CelsiusToKelvinAdapter adapter;

    private TempModel model;

    /* construtor da classe recebe um TempModel como argumento e o atribui ao atributo model.*/
    /*No construtor da sua classe TempController, você inicializa o adapter com uma instância de TempModel,
    que contém a temperatura atual em Celsius:*/
    public TempController(TempModel model) {
        this.model = model;

        /* Inicializa o adapter com uma instância de CelsiusToKelvinAdapter, passando o model como argumento.
        O adaptador precisa acessar os dados do model para realizar sua função.*/
        this.adapter = new CelsiusToKelvinAdapter(model);
    }

    /*O método implementa o setTemperature da interface ItempController.
    Ele simplesmente passa o valor de temperatura em Celsius para o model.setCelsius(tempCelsius).
    Isso altera o estado do model para refletir a nova temperatura.
    Controller => Interface => Modelo */
    @Override
    public void setTemperature(double tempCelsius) {
        model.setCelsius(tempCelsius);
    }

    /*Obtenha a temperatura em Kelvin para o adapter.*/
    @Override
    public double getTemperatureKelvin() {
        return adapter.getTemperatureKelvin();
    }
}



