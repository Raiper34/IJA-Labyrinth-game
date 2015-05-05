package ija.elements;

import ija.homework2.board.MazeCard.CANGO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Trieda, na ukladanie informaci do suboru
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class Save 
{
    /**
     * Metoda na ulozenie informaci do suboru daneho argumentom
     * @param subor do ktoreho ukladame informacie
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException 
     */
    public void ulozitHru(File subor) throws FileNotFoundException, UnsupportedEncodingException
    {
        try (PrintWriter writer = new PrintWriter(subor, "UTF-8")) {
            
            //Hlavne informacie sa ulozia
            writer.println(AllMainObjects.undoX);//1
            writer.println(AllMainObjects.undoY);//2
            writer.println(AllMainObjects.hracNaTahu); //3
            writer.println(AllMainObjects.pocetUloh); //4
            writer.println(AllMainObjects.hraciePole.riadky); //5
            writer.println(AllMainObjects.poleHracov.pocetHracov); //6
            writer.println(AllMainObjects.balicekKariet.size()); //7
            writer.println(AllMainObjects.undoVisible); //8
            writer.println(AllMainObjects.vlozKamenVisible); //9
            
            //Ulozenie volnej karty
            if(AllMainObjects.hraciePole.volnaKarta.left == CANGO.NULL)
            {
                writer.println(0);
            }
            else
            {
                writer.println(1);
            }
            if(AllMainObjects.hraciePole.volnaKarta.up == CANGO.NULL)
            {
                writer.println(0);
            }
            else
            {
                writer.println(1);
            }
            if(AllMainObjects.hraciePole.volnaKarta.right == CANGO.NULL)
            {
                writer.println(0);
            }
            else
            {
                writer.println(1);
            }
            if(AllMainObjects.hraciePole.volnaKarta.down == CANGO.NULL)
            {
                writer.println(0);
            }
            else
            {
                writer.println(1);
            }
            writer.println(AllMainObjects.hraciePole.volnaKarta.uloha);
            
            //Ulozenie hracov
            for(int i = 1; i <= AllMainObjects.poleHracov.pocetHracov; i++)
            {
                writer.println(AllMainObjects.poleHracov.poleHracov[i].poziciaX);
                writer.println(AllMainObjects.poleHracov.poleHracov[i].poziciaY);
                writer.println(AllMainObjects.poleHracov.poleHracov[i].uloha);
                writer.println(AllMainObjects.poleHracov.poleHracov[i].ziskaneBody);
            }
            
            //Ulozenie policok na hracej plochy a plochu
            for(int i = 1; i <= AllMainObjects.hraciePole.riadky; i++)
            {
                for(int j = 1; j <= AllMainObjects.hraciePole.riadky; j++)
                {
                    if(AllMainObjects.hraciePole.plocha[i][j].karta.left == CANGO.NULL)
                    {
                        writer.println(0);
                    }
                    else
                    {
                        writer.println(1);
                    }
                    if(AllMainObjects.hraciePole.plocha[i][j].karta.up == CANGO.NULL)
                    {
                        writer.println(0);
                    }
                    else
                    {
                        writer.println(1);
                    }
                    if(AllMainObjects.hraciePole.plocha[i][j].karta.right == CANGO.NULL)
                    {
                        writer.println(0);
                    }
                    else
                    {
                        writer.println(1);
                    }
                    if(AllMainObjects.hraciePole.plocha[i][j].karta.down == CANGO.NULL)
                    {
                        writer.println(0);
                    }
                    else
                    {
                        writer.println(1);
                    }
                    writer.println(AllMainObjects.hraciePole.plocha[i][j].karta.uloha);
                }
            }
            
            //Ulozenie balicku
            for(int i = 0; i < AllMainObjects.pocetUloh; i++)
            {
                writer.println(AllMainObjects.balicekKariet.balicek[i].getCard().getCode());
            }
            
        }
    }
}
