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
            writer.println(ALL.hracNaTahu);
            writer.println(ALL.pocetUloh);
            writer.println(ALL.hraciePole.riadky);
            writer.println(ALL.poleHracov.pocetHracov);
            writer.println(ALL.balicekKariet.maxSize);
            
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
        }
    }
}
