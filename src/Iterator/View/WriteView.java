package Iterator.View;

import Iterator.Controller.IController;
import Iterator.Controller.Controller;
import Iterator.Model.Model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class WriteView {
    private JPanel panelMain;
    private JFormattedTextField In_txt;
    private JButton Btn_Save;
    private JButton Btn_clear;
    private JButton Btn_print;
    private JTextArea Out_txt;

    public WriteView() {

        Model model = new Model();
        IController controller = new Controller(model);
        Btn_Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = In_txt.getText();
                controller.addWord(word);
            }
        });
        Btn_print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Iterator<String> iterator = model.getWordsIterator();
                while (iterator.hasNext()) {
                    Out_txt.append(iterator.next() + "\n");
                }
            }
        });
        Btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Out_txt.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new ViewPrint();
                JFrame frame = new JFrame("Tela de Pesquisa");
                frame.setContentPane(new WriteView().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
