package ija.ui;
import ija.elements.AllMainObjects;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Trieda, na vykreslovanie predmetu/karty ktoru ma dany rhac najst
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class HracovaKartaGUI extends JPanel
{   
    /**
     * Metoda, ktora vyrkesli hracovu kartu
     */
    public void vytvorHracKartGui()
    {
        removeAll();
        revalidate();
        repaint();
        if(AllMainObjects.poleHracov.poleHracov[AllMainObjects.hracNaTahu].uloha != -1)
        {
            try {
                BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/poklady/" + Integer.toString(AllMainObjects.poleHracov.poleHracov[AllMainObjects.hracNaTahu].uloha) + ".png"));
                Image dimg = obrazok.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
                add(new JLabel(new ImageIcon(dimg)));
            } catch (IOException ex) {
                Logger.getLogger(HraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setOpaque(false);
    }
    
}
