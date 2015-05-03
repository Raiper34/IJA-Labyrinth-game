/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ija.ui;
import ija.elements.ALL;
import ija.homework2.board.MazeBoard;

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
public class hraciGUI extends JPanel
{
    JPanel hraciGuiPanel[][];
    MazeBoard hraciaPlocha;
    
    public hraciGUI()
    {
        this.hraciaPlocha = null;
        setLayout(null);
        this.hraciGuiPanel = new JPanel[12][12];
        //vytvorGui();
    }
    
    public void vytvorPokladyGui()
    {
        removeAll();
        revalidate();
        repaint();
        this.hraciaPlocha = ALL.hraciePole;
        setLayout(new GridLayout(this.hraciaPlocha.riadky, this.hraciaPlocha.riadky, 0, 0));
        for(int i = 1; i <= this.hraciaPlocha.riadky; i++)
        {
            for(int j = 1; j <= this.hraciaPlocha.riadky; j++)
            {
                
                this.hraciGuiPanel[i][j] = new JPanel();
                
                
                if(i == ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaX)
                {
                try {
                    BufferedImage obrazok = ImageIO.read(getClass().getResource("/ija/ui/obrazky_hraci/1.png"));
                    Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                    this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                } catch (IOException ex) {
                    Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                
                
                setOpaque(false);
                this.hraciGuiPanel[i][j].setOpaque(false);
                add(this.hraciGuiPanel[i][j]);
                //add(new JButton());5
            }
        }
    }
    
}
