package ija.ui;
import ija.elements.AllMainObjects;
import ija.homework2.board.MazeBoard;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.*;

/**
 * Trieda, ktora sluzi na vykreslovanie pokladov na polickach
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class PokladyGUI extends JPanel
{
    JPanel pokladyGui[][];
    MazeBoard hraciaPlocha;
    
    /**
     * Konstruktor triedy
     */
    public PokladyGUI()
    {
        this.hraciaPlocha = null;
        setLayout(null);
        this.pokladyGui = new JPanel[12][12];
        //vytvorGui();
    }
    
    /**
     * Metoda, ktora vyrkelsi poklady na jednotlivych polickach
     */
    public void vytvorPokladyGui()
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
                
                this.pokladyGui[i][j] = new JPanel();
                if(AllMainObjects.hraciePole.plocha[i][j].karta.uloha != - 1)
                {
                    Image dimg = NacitanieObrazkov.obrazkyPoklady[AllMainObjects.hraciePole.plocha[i][j].karta.uloha].getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                    this.pokladyGui[i][j].add(new JLabel(new ImageIcon(dimg)));
                }
                setOpaque(false);
                this.pokladyGui[i][j].setOpaque(false);
                add(this.pokladyGui[i][j]);
                //add(new JButton());5
            }
        }
    }
    
}
