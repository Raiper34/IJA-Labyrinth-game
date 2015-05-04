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
public class hracovaKartaGUI extends JPanel
{   
    public void vytvorHracKartGui()
    {
        removeAll();
        revalidate();
        repaint();
        if(ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha != -1)
        {
            try {
                BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/poklady/" + Integer.toString(ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha) + ".png"));
                Image dimg = obrazok.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
                add(new JLabel(new ImageIcon(dimg)));
            } catch (IOException ex) {
                Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setOpaque(false);
    }
    
}
