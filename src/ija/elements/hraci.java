package ija.elements;

import ija.elements.hrac;
import ija.homework2.board.MazeBoard;

/**
 * Created by raiper34 on 28.4.15.
 */
public class hraci {
    int pocetHracov;
    public hrac poleHracov[];
    int pocetRiadkov;
    int pocetStlpcov;

    public hraci(int pocetHracov, int pocetRiadkov, int pocetStlpcov)
    {
        this.pocetHracov = pocetHracov;
        this.poleHracov = new hrac[pocetHracov+1];
        this.pocetRiadkov = pocetRiadkov;
        this.pocetStlpcov = pocetStlpcov;
    }

    public static hraci vytvorHracov(int pocetHracov, int pocetRiadkov, int pocetStlpcov)
    {
        hraci zoznamHracov = new hraci(pocetHracov, pocetRiadkov, pocetStlpcov);
        zoznamHracov.poleHracov[0] = new hrac(pocetStlpcov, pocetRiadkov, 0, 0);
        if(pocetHracov < 2)
        {
            System.out.println("CHyba malo hracov!");
        }
        else if(pocetHracov > 4)
        {
            System.out.println("CHyba malo hracov!");
        }
        else if(pocetHracov == 2)
        {
            zoznamHracov.poleHracov[1] = new hrac(0, 0, -1, 0);
            zoznamHracov.poleHracov[2] = new hrac(pocetStlpcov, pocetRiadkov, -1, 0);
            System.out.println("Vytvoril som hracov 2");
        }
        else if(pocetHracov == 3)
        {
            zoznamHracov.poleHracov[1] = new hrac(0, 0, -1, 0);
            zoznamHracov.poleHracov[2] = new hrac(pocetStlpcov, pocetRiadkov, -1, 0);
            zoznamHracov.poleHracov[3] = new hrac(0, pocetRiadkov, -1, 0);
            System.out.println("Vytvoril som hracov 3");
        }
        else if(pocetHracov == 4)
        {
            zoznamHracov.poleHracov[1] = new hrac(0, 0, -1, 0);
            zoznamHracov.poleHracov[2] = new hrac(pocetStlpcov, pocetRiadkov, -1, 0);
            zoznamHracov.poleHracov[3] = new hrac(0, pocetRiadkov, -1, 0);
            zoznamHracov.poleHracov[4] = new hrac(pocetStlpcov, 0, -1, 0);
            System.out.println("Vytvoril som hracov 4");
        }
        return zoznamHracov;
    }
}
