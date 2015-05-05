package ija.elements;

import ija.player.PlayerTeam;
import ija.homework1.treasure.CardPack;
import ija.homework2.board.MazeBoard;
import ija.homework2.board.MazeCard.CANGO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Trieda, na pracu s ulozenim suborom, jeho nacitanie...
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class Load 
{
    /**
     * Metoda, ktora nacita subor dany argumentom
     * @param subor subor, ktory nacitavame
     * @throws FileNotFoundException 
     */
    public void nacitatHru(File subor) throws FileNotFoundException
    {
        try {
            String riadok;
            InputStream suborStream = new FileInputStream(subor);
            InputStreamReader suborReader = new InputStreamReader(suborStream, Charset.forName("UTF-8"));
            BufferedReader br = new BufferedReader(suborReader);
            
            //Hlavne informacie, ktore nacitavame
            AllMainObjects.undoX=Integer.parseInt(br.readLine());//1
            AllMainObjects.undoY=Integer.parseInt(br.readLine());//2
            AllMainObjects.hracNaTahu=Integer.parseInt(br.readLine()); //3
            
            AllMainObjects.pocetUloh=Integer.parseInt(br.readLine()); //4
            int riadky=Integer.parseInt(br.readLine()); //5 
            int pocethracov=Integer.parseInt(br.readLine()); //6
            int VelkostBalicka = Integer.parseInt(br.readLine()); //7
            AllMainObjects.undoVisible = Integer.parseInt(br.readLine()); //8
            AllMainObjects.vlozKamenVisible = Integer.parseInt(br.readLine()); //9
            AllMainObjects.pocetHracovCelkovo = pocethracov; 
            
            //Vytvorime objekty do ktorym budeme davat informacie ktore nacitame
            CardPack novybalicek = new CardPack(AllMainObjects.pocetUloh,AllMainObjects.pocetUloh);
            AllMainObjects.balicekKariet = novybalicek;
            AllMainObjects.balicekKariet.actSize = VelkostBalicka;
            
            MazeBoard hraciaPlocha = MazeBoard.createMazeBoard(riadky);
            AllMainObjects.hraciePole = hraciaPlocha;
            hraciaPlocha.newGame();
            
            PlayerTeam zoznamHracov = PlayerTeam.vytvorHracov(pocethracov, riadky, riadky);
            AllMainObjects.poleHracov = zoznamHracov;
            
            //Nacitavanie volnej karty
            if(Integer.parseInt(br.readLine())== 1)
            {
                AllMainObjects.hraciePole.volnaKarta.left = CANGO.LEFT;
            }
            else
            {
               AllMainObjects.hraciePole.volnaKarta.left = CANGO.NULL; 
            }
            if(Integer.parseInt(br.readLine())== 1)
            {
                AllMainObjects.hraciePole.volnaKarta.up = CANGO.UP;
            }
            else
            {
               AllMainObjects.hraciePole.volnaKarta.up = CANGO.NULL; 
            }
            if(Integer.parseInt(br.readLine())== 1)
            {
                AllMainObjects.hraciePole.volnaKarta.right = CANGO.RIGHT;
            }
            else
            {
               AllMainObjects.hraciePole.volnaKarta.right = CANGO.NULL; 
            }
            if(Integer.parseInt(br.readLine())== 1)
            {
                AllMainObjects.hraciePole.volnaKarta.down = CANGO.DOWN;
            }
            else
            {
               AllMainObjects.hraciePole.volnaKarta.down = CANGO.NULL; 
            }
            AllMainObjects.hraciePole.volnaKarta.uloha = Integer.parseInt(br.readLine());
            
            //Nacitanie hracov
            for(int i = 1; i <= AllMainObjects.poleHracov.pocetHracov; i++)
            {
                AllMainObjects.poleHracov.poleHracov[i].poziciaX = Integer.parseInt(br.readLine());
                AllMainObjects.poleHracov.poleHracov[i].poziciaY = Integer.parseInt(br.readLine());
                AllMainObjects.poleHracov.poleHracov[i].uloha = Integer.parseInt(br.readLine());
                AllMainObjects.poleHracov.poleHracov[i].ziskaneBody = Integer.parseInt(br.readLine());
            }
            
            //Nacitanie pola a jeho policok
            for(int i = 1; i <= AllMainObjects.hraciePole.riadky; i++)
            {
                for(int j = 1; j <= AllMainObjects.hraciePole.riadky; j++)
                {
                    if(Integer.parseInt(br.readLine())== 1)
                    {
                        AllMainObjects.hraciePole.plocha[i][j].karta.left = CANGO.LEFT;
                    }
                    else
                    {
                       AllMainObjects.hraciePole.plocha[i][j].karta.left = CANGO.NULL; 
                    }
                    if(Integer.parseInt(br.readLine())== 1)
                    {
                        AllMainObjects.hraciePole.plocha[i][j].karta.up = CANGO.UP;
                    }
                    else
                    {
                       AllMainObjects.hraciePole.plocha[i][j].karta.up = CANGO.NULL; 
                    }
                    if(Integer.parseInt(br.readLine())== 1)
                    {
                        AllMainObjects.hraciePole.plocha[i][j].karta.right = CANGO.RIGHT;
                    }
                    else
                    {
                       AllMainObjects.hraciePole.plocha[i][j].karta.right = CANGO.NULL; 
                    }
                    if(Integer.parseInt(br.readLine())== 1)
                    {
                        AllMainObjects.hraciePole.plocha[i][j].karta.down = CANGO.DOWN;
                    }
                    else
                    {
                       AllMainObjects.hraciePole.plocha[i][j].karta.down = CANGO.NULL; 
                    }
                    AllMainObjects.hraciePole.plocha[i][j].karta.uloha = Integer.parseInt(br.readLine());
                }
            }
            
            //Nacitanie kariet
            for(int i = 0; i < AllMainObjects.pocetUloh; i++)
            {
               //System.out.println("Karta ok: " + i);
               AllMainObjects.balicekKariet.balicek[i].karta.code = Integer.parseInt(br.readLine());
            }
            
                       
        } catch (IOException ex) {
            Logger.getLogger(Load.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
}
