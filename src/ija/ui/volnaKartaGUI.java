/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ija.ui;
import ija.elements.ALL;
import ija.homework2.board.MazeBoard;
import ija.homework2.board.MazeCard;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author user
 */
public class volnaKartaGUI extends JPanel
{   
    public void vytvorVolnuGui()
    {
        removeAll();
        revalidate();
        repaint();
        MazeCard volnaKarta = ALL.hraciePole.getFreeCard();
        int menoU = 1;
        int menoD = 1;
        int menoL = 1;
        int menoR = 1;
        if(volnaKarta.up.ordinal() != 4)
        {
            menoU = 1;
        }
        else
        {
            menoU = 0;
        }
        if(volnaKarta.right.ordinal() != 4)
        {
            menoR = 1;
        }
        else
        {
            menoR = 0;
        }
        if(volnaKarta.down.ordinal() != 4)
        {
            menoD = 1;
        }
        else
        {
            menoD = 0;
        }
        if(volnaKarta.left.ordinal() != 4)
        {
            menoL = 1;
        }
        else
        {
            menoL = 0;
        }
        String meno = Integer.toString(menoU) + Integer.toString(menoR) + Integer.toString(menoD) + Integer.toString(menoL);
        try {
            BufferedImage obrazok = ImageIO.read(getClass().getResource("/ija/ui/" + meno + ".png"));
            Image dimg = obrazok.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
            add(new JLabel(new ImageIcon(dimg)));
        } catch (IOException ex) {
            Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
}
