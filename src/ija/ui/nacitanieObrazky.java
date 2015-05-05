/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ija.ui;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author user
 */
public class nacitanieObrazky {
    
    public static BufferedImage[] obrazkyPolicka;
    public static BufferedImage[] obrazkyPoklady;
    
    public nacitanieObrazky() throws IOException
    {
        nacitanieObrazky.obrazkyPolicka = new BufferedImage[10];
        nacitanieObrazky.obrazkyPoklady = new BufferedImage[12];
        for(int i = 0; i < 10; i++ )
        {
            nacitanieObrazky.obrazkyPolicka[i] = ImageIO.read(getClass().getResource("/resources/cesty/" + i + ".png"));
        }
        for(int i = 0; i < 12; i++ )
        {
            nacitanieObrazky.obrazkyPoklady[i] = ImageIO.read(getClass().getResource("/resources/poklady/" + i + ".png"));
        }
    }
    
}
