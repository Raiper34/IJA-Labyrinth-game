package ija.ui;

import ija.elements.AllMainObjects;
import ija.homework2.board.MazeBoard;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.*;

/**
 * Trieda, na vykreslovanie hracej plchy
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class HraciaPlochaGUI extends JPanel
{
    JPanel polickaGui[][];
    MazeBoard hraciaPlocha;
    
    /**
     * Konstuktor triedy
     */
    public HraciaPlochaGUI()
    {
        this.hraciaPlocha = null;
        setLayout(null);
        this.polickaGui = new JPanel[12][12];
        //vytvorGui();
    }
    
    /**
     * Metoda, ktora vykresli hraicu plochu, policka...
     */
    public void vytvorGui()
    {
        removeAll();
        revalidate();
        repaint();
        this.hraciaPlocha = AllMainObjects.hraciePole;
        setLayout(new GridLayout(this.hraciaPlocha.riadky, this.hraciaPlocha.riadky, 0, 0));
        for(int i = 1; i <= this.hraciaPlocha.riadky; i++)
        {
            for(int j = 1; j <= this.hraciaPlocha.riadky; j++)
            {
                int menoU = 1;
                int menoD = 1;
                int menoL = 1;
                int menoR = 1;
                if(AllMainObjects.hraciePole.plocha[i][j].karta.up.ordinal() != 4)
                {
                    menoU = 1;
                }
                else
                {
                    menoU = 0;
                }
                if(AllMainObjects.hraciePole.plocha[i][j].karta.right.ordinal() != 4)
                {
                    menoR = 1;
                }
                else
                {
                    menoR = 0;
                }
                if(AllMainObjects.hraciePole.plocha[i][j].karta.down.ordinal() != 4)
                {
                    menoD = 1;
                }
                else
                {
                    menoD = 0;
                }
                if(AllMainObjects.hraciePole.plocha[i][j].karta.left.ordinal() != 4)
                {
                    menoL = 1;
                }
                else
                {
                    menoL = 0;
                }
                String meno = Integer.toString(menoU) + Integer.toString(menoR) + Integer.toString(menoD) + Integer.toString(menoL);
                
                if(meno.equals("0101"))
                {
                    meno = "0";
                }
                else if(meno.equals("1010"))
                {
                    meno = "1";
                }
                else if(meno.equals("0011"))
                {
                    meno = "2";
                }
                else if(meno.equals("0110"))
                {
                    meno = "3";
                }
                else if(meno.equals("1001"))
                {
                    meno = "4";
                }
                else if(meno.equals("1100"))
                {
                    meno = "5";
                }
                else if(meno.equals("0111"))
                {
                    meno = "6";
                }
                else if(meno.equals("1011"))
                {
                    meno = "7";
                }
                else if(meno.equals("1101"))
                {
                    meno = "8";
                }
                else
                {
                    meno = "9";
                }
                this.polickaGui[i][j] = new JPanel();
                Image dimg = NacitanieObrazkov.obrazkyPolicka[Integer.parseInt(meno)].getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                this.polickaGui[i][j].add(new JLabel(new ImageIcon(dimg)));
                setOpaque(false);
                this.polickaGui[i][j].setOpaque(false);
                add(this.polickaGui[i][j]);
                //add(new JButton());5
            }
        }
    }
    
}
