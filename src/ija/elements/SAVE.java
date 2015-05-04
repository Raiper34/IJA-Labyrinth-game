/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ija.elements;

import ija.homework2.board.MazeCard.CANGO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author user
 */
public class SAVE 
{
    public void ulozitHru(File subor) throws FileNotFoundException, UnsupportedEncodingException
    {
        try (PrintWriter writer = new PrintWriter(subor, "UTF-8")) {
            //writer.println(ALL.hracNaTahu);
            //writer.println(ALL.hracNaTahu);
            writer.println(ALL.hracNaTahu); //1
            writer.println(ALL.pocetUloh); //2
            writer.println(ALL.hraciePole.riadky); //3
            writer.println(ALL.poleHracov.pocetHracov); //4
            writer.println(ALL.balicekKariet.size()); //5
            
            
            if(ALL.hraciePole.volnaKarta.left == CANGO.NULL)
            {
                writer.println(0);
            }
            else
            {
                writer.println(1);
            }
            if(ALL.hraciePole.volnaKarta.up == CANGO.NULL)
            {
                writer.println(0);
            }
            else
            {
                writer.println(1);
            }
            if(ALL.hraciePole.volnaKarta.right == CANGO.NULL)
            {
                writer.println(0);
            }
            else
            {
                writer.println(1);
            }
            if(ALL.hraciePole.volnaKarta.down == CANGO.NULL)
            {
                writer.println(0);
            }
            else
            {
                writer.println(1);
            }
            writer.println(ALL.hraciePole.volnaKarta.uloha);
            
            for(int i = 1; i <= ALL.poleHracov.pocetHracov; i++)
            {
                writer.println(ALL.poleHracov.poleHracov[i].poziciaX);
                writer.println(ALL.poleHracov.poleHracov[i].poziciaY);
                writer.println(ALL.poleHracov.poleHracov[i].uloha);
                writer.println(ALL.poleHracov.poleHracov[i].ziskaneBody);
            }
            
            for(int i = 1; i <= ALL.hraciePole.riadky; i++)
            {
                for(int j = 1; j <= ALL.hraciePole.riadky; j++)
                {
                    if(ALL.hraciePole.plocha[i][j].karta.left == CANGO.NULL)
                    {
                        writer.println(0);
                    }
                    else
                    {
                        writer.println(1);
                    }
                    if(ALL.hraciePole.plocha[i][j].karta.up == CANGO.NULL)
                    {
                        writer.println(0);
                    }
                    else
                    {
                        writer.println(1);
                    }
                    if(ALL.hraciePole.plocha[i][j].karta.right == CANGO.NULL)
                    {
                        writer.println(0);
                    }
                    else
                    {
                        writer.println(1);
                    }
                    if(ALL.hraciePole.plocha[i][j].karta.down == CANGO.NULL)
                    {
                        writer.println(0);
                    }
                    else
                    {
                        writer.println(1);
                    }
                    writer.println(ALL.hraciePole.plocha[i][j].karta.uloha);
                }
            }
            
            //writer.println("Karty");
            for(int i = 0; i < ALL.pocetUloh; i++)
            {
                writer.println(ALL.balicekKariet.balicek[i].getCard().getCode());
            }
            
        }
    }
}
