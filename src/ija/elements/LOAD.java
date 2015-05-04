/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ija.elements;

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
        String riadok;
        InputStream suborStream = new FileInputStream(subor);
        InputStreamReader suborReader = new InputStreamReader(suborStream, Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(suborReader);
        try {
            while ((riadok = br.readLine()) != null) {
                // Deal with the line
                System.out.println(riadok);
            }
        } catch (IOException ex) {
            Logger.getLogger(LOAD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
