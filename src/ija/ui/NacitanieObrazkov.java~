package ija.ui;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Trieda, ktora sluzi na nacitanie obrazkov pre rychlejsiu pracu
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class NacitanieObrazkov {
    
    public static BufferedImage[] obrazkyPolicka;
    public static BufferedImage[] obrazkyPoklady;
    
    /**
     * Metoda, ktora nacita obrazky a uklada ich do pola pre rychlejsiu pracu s GUI
     * @throws IOException 
     */
    public NacitanieObrazkov() throws IOException
    {
        NacitanieObrazkov.obrazkyPolicka = new BufferedImage[10];
        NacitanieObrazkov.obrazkyPoklady = new BufferedImage[24];
        for(int i = 0; i < 10; i++ )
        {
            NacitanieObrazkov.obrazkyPolicka[i] = ImageIO.read(getClass().getResource("/resources/cesty/" + i + ".png"));
        }
        for(int i = 0; i < 24; i++ )
        {
            NacitanieObrazkov.obrazkyPoklady[i] = ImageIO.read(getClass().getResource("/resources/poklady/" + i + ".png"));
        }
    }
    
}
