package Adapter.View;

import Adapter.Controller.ItempController;
import Adapter.Controller.TempController;
import Adapter.Model.TempModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempView {
    private JPanel panelMain;
    private JFormattedTextField Input_C;
    private JButton Btn_Conv;
    private JFormattedTextField Out_K;
    private ItempController controller;

    public TempView() {

        Out_K.setEditable(false);

        /*Cria uma instância de TempController, passando o model como argumento.
        TempView => TempController => TempModel*/
        TempModel model = new TempModel();
        controller = new TempController(model);

        Btn_Conv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Variavel Local
                double TempAtual;
                // Conversão String para Double
                TempAtual = Double.parseDouble(Input_C.getText());
                // Valor Repassado ao controller
                controller.setTemperature(TempAtual);

                /*Chama o metodo abaixo para representação da temperatura
                obtido pelo padrão de projeto adapter*/
                CovertKelvin();
            }
        });
    }
    public void CovertKelvin(){
        /*Obtém a temperatura em Kelvin do controlador
        View => Controller => Modelo*/
        double tempKelvin = controller.getTemperatureKelvin();

        //Conversão para String
        Out_K.setText(String.valueOf(tempKelvin));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new ViewPrint();
                JFrame frame = new JFrame("Tela de Temperatura");
                frame.setContentPane(new TempView().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
