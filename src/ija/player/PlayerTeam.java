package ija.player;

/**
 * Trieda, na pracu s hracmi, ktory su pre lahsiu manipulaciu v poli ulozeny
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class PlayerTeam {
    public int pocetHracov;
    public Player poleHracov[];
    int pocetRiadkov;
    int pocetStlpcov;
    
    /**
     * Konstruktor triedy
     * @param pocetHracov ktory budu rhat hru
     * @param pocetRiadkov rozmer hracej plochy
     * @param pocetStlpcov rozmer hracej plochy
     */
    public PlayerTeam(int pocetHracov, int pocetRiadkov, int pocetStlpcov)
    {
        this.pocetHracov = pocetHracov;
        this.poleHracov = new Player[4+1];
        this.pocetRiadkov = pocetRiadkov;
        this.pocetStlpcov = pocetStlpcov;
    }

    /**
     * Metoda, ktora vytvori vsetkych hracov
     * @param pocetHracov ktorych metoda vytvara
     * @param pocetRiadkov rozmer hracej plochy
     * @param pocetStlpcov rozmer hracej plochy
     * @return 
     */
    public static PlayerTeam vytvorHracov(int pocetHracov, int pocetRiadkov, int pocetStlpcov)
    {
        PlayerTeam zoznamHracov = new PlayerTeam(pocetHracov, pocetRiadkov, pocetStlpcov);
        zoznamHracov.poleHracov[0] = new Player(pocetStlpcov, pocetRiadkov, 0, 0);
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
            zoznamHracov.poleHracov[1] = new Player(1, 1, -1, 0);
            zoznamHracov.poleHracov[2] = new Player(pocetStlpcov, pocetRiadkov, -1, 0);
            zoznamHracov.poleHracov[3] = new Player(0, 0, 0, 0);
            zoznamHracov.poleHracov[4] = new Player(0, 0, 0, 0);
            System.out.println("Vytvoril som hracov 2");
        }
        else if(pocetHracov == 3)
        {
            zoznamHracov.poleHracov[1] = new Player(1, 1, -1, 0);
            zoznamHracov.poleHracov[2] = new Player(pocetStlpcov, pocetRiadkov, -1, 0);
            zoznamHracov.poleHracov[3] = new Player(1, pocetRiadkov, -1, 0);
            zoznamHracov.poleHracov[4] = new Player(0, 0, 0, 0);
            System.out.println("Vytvoril som hracov 3");
        }
        else if(pocetHracov == 4)
        {
            zoznamHracov.poleHracov[1] = new Player(1, 1, -1, 0);
            zoznamHracov.poleHracov[2] = new Player(pocetStlpcov, pocetRiadkov, -1, 0);
            zoznamHracov.poleHracov[3] = new Player(1, pocetRiadkov, -1, 0);
            zoznamHracov.poleHracov[4] = new Player(pocetStlpcov, 1, -1, 0);
            System.out.println("Vytvoril som hracov 4");
        }
        return zoznamHracov;
    }
}
