package ija.ui;
import ija.elements.AllMainObjects;
import ija.homework2.board.MazeCard;

import java.awt.Image;
import javax.swing.*;

/**
 * Trieda, ktora sluzi na vykreslovanie volneho policka
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class VolnePolickoGUI extends JPanel
{   
    /**
     * Metoda, ktora vykrelsi volne policko
     */
    public void vytvorVolnuGui()
    {
        removeAll();
        revalidate();
        repaint();
        MazeCard volnaKarta = AllMainObjects.hraciePole.getFreeCard();
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
        Image dimg = NacitanieObrazkov.obrazkyPolicka[Integer.parseInt(meno)].getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
        add(new JLabel(new ImageIcon(dimg)));   
        setOpaque(false);
    }
    
}
