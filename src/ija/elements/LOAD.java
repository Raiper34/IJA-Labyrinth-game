/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ija.elements;

import ija.homework2.board.MazeCard;
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
 *
 * @author user
 */
public class LOAD 
{
    public void nacitatHru(File subor) throws FileNotFoundException
    {
        try {
            String riadok;
            InputStream suborStream = new FileInputStream(subor);
            InputStreamReader suborReader = new InputStreamReader(suborStream, Charset.forName("UTF-8"));
            BufferedReader br = new BufferedReader(suborReader);
            //try
            //while ((riadok = br.readLine()) != null) {
            // Deal with the line
            //System.out.println(riadok);
            
            
            
            
            
            
            //} catch (IOException ex) {
            //    Logger.getLogger(LOAD.class.getName()).log(Level.SEVERE, null, ex);
            //}
            
            ALL.hracNaTahu=Integer.parseInt(br.readLine());
            ALL.pocetUloh=Integer.parseInt(br.readLine());
            int RIADKY=Integer.parseInt(br.readLine());
            int POCETHRACOV=Integer.parseInt(br.readLine());
            ALL.MaxVelkostBalicku=Integer.parseInt(br.readLine());
            if(Integer.parseInt(br.readLine())== 1)
            {
                ALL.hraciePole.volnaKarta.left = CANGO.LEFT;
            }
            else
            {
               ALL.hraciePole.volnaKarta.left = CANGO.NULL; 
            }
            if(Integer.parseInt(br.readLine())== 1)
            {
                ALL.hraciePole.volnaKarta.up = CANGO.UP;
            }
            else
            {
               ALL.hraciePole.volnaKarta.up = CANGO.NULL; 
            }
            if(Integer.parseInt(br.readLine())== 1)
            {
                ALL.hraciePole.volnaKarta.right = CANGO.RIGHT;
            }
            else
            {
               ALL.hraciePole.volnaKarta.right = CANGO.NULL; 
            }
            if(Integer.parseInt(br.readLine())== 1)
            {
                ALL.hraciePole.volnaKarta.down = CANGO.DOWN;
            }
            else
            {
               ALL.hraciePole.volnaKarta.down = CANGO.NULL; 
            }
            ALL.hraciePole.volnaKarta.uloha = Integer.parseInt(br.readLine());
            
            for(int i = 1; i <= ALL.poleHracov.pocetHracov; i++)
            {
                ALL.poleHracov.poleHracov[i].poziciaX = Integer.parseInt(br.readLine());
                ALL.poleHracov.poleHracov[i].poziciaY = Integer.parseInt(br.readLine());
                ALL.poleHracov.poleHracov[i].uloha = Integer.parseInt(br.readLine());
                ALL.poleHracov.poleHracov[i].ziskaneBody = Integer.parseInt(br.readLine());
            }
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(LOAD.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
    }
}
