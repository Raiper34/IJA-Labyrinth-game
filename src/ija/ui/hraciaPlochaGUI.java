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
public class hraciaPlochaGUI extends JPanel
{
    JPanel polickaGui[][];
    MazeBoard hraciaPlocha;
    
    public hraciaPlochaGUI()
    {
        this.hraciaPlocha = null;
        setLayout(null);
        this.polickaGui = new JPanel[12][12];
        //vytvorGui();
    }
    
    public void vytvorGui()
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
                int menoU = 1;
                int menoD = 1;
                int menoL = 1;
                int menoR = 1;
                if(ALL.hraciePole.plocha[i][j].karta.up.ordinal() != 4)
                {
                    menoU = 1;
                }
                else
                {
                    menoU = 0;
                }
                if(ALL.hraciePole.plocha[i][j].karta.right.ordinal() != 4)
                {
                    menoR = 1;
                }
                else
                {
                    menoR = 0;
                }
                if(ALL.hraciePole.plocha[i][j].karta.down.ordinal() != 4)
                {
                    menoD = 1;
                }
                else
                {
                    menoD = 0;
                }
                if(ALL.hraciePole.plocha[i][j].karta.left.ordinal() != 4)
                {
                    menoL = 1;
                }
                else
                {
                    menoL = 0;
                }
                String meno = Integer.toString(menoU) + Integer.toString(menoR) + Integer.toString(menoD) + Integer.toString(menoL);
                System.out.println(meno);
                this.polickaGui[i][j] = new JPanel();
                try {
                    BufferedImage obrazok = ImageIO.read(getClass().getResource("/ija/ui/" + meno +".png"));
                    Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                    this.polickaGui[i][j].add(new JLabel(new ImageIcon(dimg)));
                } catch (IOException ex) {
                    Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                setOpaque(false);
                this.polickaGui[i][j].setOpaque(false);
                add(this.polickaGui[i][j]);
                //add(new JButton());5
            }
        }
    }
    
}
