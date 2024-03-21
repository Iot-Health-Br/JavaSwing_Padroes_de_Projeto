package TemplateMethod;

import TemplateMethod.Controller.Controller;
import TemplateMethod.Controller.IController;
import TemplateMethod.Model.CafeComLeite;
import TemplateMethod.Model.CafePreto;
import TemplateMethod.Model.PrepararCafe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewSolicited {
    private JPanel panelMain;
    private JButton Btn_Salvar;
    private JCheckBox CB_CafePadrão;
    private JCheckBox CB_LeiteCafe;
    private JCheckBox CB_SemAçucar;
    private JCheckBox CB_Capuchino;
    private JButton Btn_Limpar;
    private JTextArea Out_txt;

    // Instância do Controller
    Controller controller = new Controller(Out_txt);


    public ViewSolicited() {
        CB_CafePadrão.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.processarEscolha("cafe");
            }
        });
        CB_LeiteCafe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.processarEscolha("leite com cafe");
            }
        });
        CB_SemAçucar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.processarEscolha("Sem Açucar");
            }
        });
        CB_Capuchino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.processarEscolha("Cafe Cappuccino");
            }
        });



        Btn_Limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Desmarca as checkboxes
                CB_CafePadrão.setSelected(false);
                CB_LeiteCafe.setSelected(false);
                CB_Capuchino.setSelected(false);
                CB_SemAçucar.setSelected(false);
                // Limpa a área de texto
                Out_txt.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new ViewPrint();
                JFrame frame = new JFrame("Tela de Pedidos:");
                frame.setContentPane(new ViewSolicited().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
