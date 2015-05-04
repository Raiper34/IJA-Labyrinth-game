/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ija.ui;
import ija.elements.ALL;
import ija.homework2.board.MazeBoard;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author user
 */
public class hraciGUI extends JPanel
{
    JPanel hraciGuiPanel[][];
    MazeBoard hraciaPlocha;
    
    public hraciGUI()
    {
        this.hraciaPlocha = null;
        setLayout(null);
        this.hraciGuiPanel = new JPanel[12][12];
        //vytvorGui();
    }
    
    public void vytvorHraciGui()
    {
        removeAll();
        revalidate();
        repaint();
        this.hraciaPlocha = ALL.hraciePole;
        setLayout(new GridLayout(this.hraciaPlocha.riadky, this.hraciaPlocha.riadky, 0, 0));
        int h1x = ALL.poleHracov.poleHracov[1].poziciaX;
        int h1y = ALL.poleHracov.poleHracov[1].poziciaY;
        
        int h2x = ALL.poleHracov.poleHracov[2].poziciaX;
        int h2y = ALL.poleHracov.poleHracov[2].poziciaY;
        
        int h3x = ALL.poleHracov.poleHracov[3].poziciaX;
        int h3y = ALL.poleHracov.poleHracov[3].poziciaY;
        
        int h4x = ALL.poleHracov.poleHracov[4].poziciaX;
        int h4y = ALL.poleHracov.poleHracov[4].poziciaY;
       
        for(int j = 1; j <= this.hraciaPlocha.riadky; j++)
        {
            for(int i = 1; i <= this.hraciaPlocha.riadky; i++)
            {
                
                this.hraciGuiPanel[i][j] = new JPanel();
                
                //1234
                if((i == h1x) && (i==h2x) && (i== h3x) &&(i==h4x) &&(j == h1y) && (j==h2y) && (j== h3y) && (j==h4y))
                {
                    try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/1234.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                //234
                else if ((i==h2x) && (i== h3x) &&(i==h4x) && (j==h2y) && (j== h3y) && (j==h4y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/234.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //134
                else if ((i==h1x) && (i== h3x) &&(i==h4x) && (j==h1y) && (j== h3y) && (j==h4y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/134.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //124
                else if ((i==h1x) && (i== h2x) &&(i==h4x) && (j==h1y) && (j== h2y) && (j==h4y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/124.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                
                //123
                else if ((i==h1x) && (i== h2x) &&(i==h3x) && (j==h1y) && (j== h2y) && (j==h3y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/123.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //34
                else if ( (i== h3x) &&(i==h4x) && (j== h3y) && (j==h4y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/34.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //24
                else if ( (i== h2x) &&(i==h4x) && (j== h2y) && (j==h4y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/24.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //23
                else if ( (i== h2x) &&(i==h3x) && (j== h2y) && (j==h3y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/23.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //14
                else if ( (i== h1x) &&(i==h4x) && (j== h1y) && (j==h4y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/14.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                
                //13
                else if ( (i== h1x) &&(i==h3x) && (j== h1y) && (j==h3y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/13.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //12
                else if ( (i== h1x) &&(i==h2x) && (j== h1y) && (j==h2y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/12.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //4
                else if ( (i==h4x) &&  (j==h4y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/4.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //3
                else if ( (i==h3x) &&  (j==h3y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/3.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //2
                else if ( (i==h2x) &&  (j==h2y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/2.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                
                //1
                else if ( (i==h1x) &&  (j==h1y) )
                {
                   try 
                    {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/resources/hraci/1.png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.hraciGuiPanel[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
                    
                
                
                
                
                
                
                setOpaque(false);
                this.hraciGuiPanel[i][j].setOpaque(false);
                add(this.hraciGuiPanel[i][j]);
                //add(new JButton());5
            }
        }
    }
    
}
