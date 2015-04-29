package ija.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by eduard on 27.4.15.
 */
public class guiMenu {
    private JPanel menu;
    private JButton NOVAHRAButton;
    private JButton ULOZITHRUButton;
    private JButton NAHRATHRUButton;
    private JButton OPUSTITHRUButton;
    private JPanel nastavenia;


    public guiMenu() {
        OPUSTITHRUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                System.exit(0);
            }
        });
        NOVAHRAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //startMenu.setVisible( false );
                nastavenia.remove(menu);

                guiMenu startMenu = new guiMenu();
                startMenu.GuiMenu();


            }
        });
    }

    public static void GuiMenu() {

        JFrame frameMenu = new JFrame("guiMenu");
        frameMenu.setContentPane(new guiMenu().menu);
        frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frameMenu.pack();
        frameMenu.setVisible(true);




    }
}
