package ija.ui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by raiper34 on 27.4.15.
 */
public class guiHra {

    private JPanel hraObrazovka;
    private JButton uloziHruButton;
    private JButton menuButton;
    private JTextArea poziciaXTextArea;
    private JTextArea poziciaYTextArea;
    private JButton potvrditButton;
    private JPanel ingameMenu;


    public guiHra() {
        menuButton.addMouseListener(new MouseAdapter() {
            @Override

            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                menuButton.setText("Kurvaaaaa");
                hraObrazovka.remove(ingameMenu);
            }
        });
    }

    public static void createUIComponents()
    {
        JFrame frame = new JFrame("guiHra");
        frame.setContentPane(new guiHra().hraObrazovka);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
