package ija.ui;
import ija.elements.AllMainObjects;
import ija.homework2.board.MazeCard;

import java.awt.Image;
import javax.swing.*;

/**
 * Trieda, na vykreslovanie pokladu, ktory sa nachadza na volnom policku
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class VolnyPokladGUI extends JPanel
{   
    /**
     * Metoda, ktora vykrelsi poklad na volnom policku
     */
    public void vytvorVolnuPGui()
    {
        removeAll();
        revalidate();
        repaint();
        MazeCard volnaKarta = AllMainObjects.hraciePole.getFreeCard();
        if(AllMainObjects.hraciePole.volnaKarta.uloha != -1)
        {
            Image dimg = NacitanieObrazkov.obrazkyPoklady[AllMainObjects.hraciePole.volnaKarta.uloha].getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
            add(new JLabel(new ImageIcon(dimg)));   
        }
        setOpaque(false);
    }
    
}
