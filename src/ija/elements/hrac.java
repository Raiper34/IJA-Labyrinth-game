package ija.elements;

/**
 * Created by raiper34 on 28.4.15.
 */
public class hrac {

    public int poziciaX;
    public int poziciaY;
    public int uloha;
    public int ziskaneBody;

    public hrac(int poziciaX, int poziciaY, int uloha, int ziskaneBody)
    {
        this.poziciaX = poziciaX;
        this.poziciaY = poziciaY;
        this.uloha = uloha;
        this.ziskaneBody = ziskaneBody;
    }
    
    public void zmenX(int posun)
    {
        this.poziciaX += posun;
        if(poziciaX < 1)
        {
            this.poziciaX = ALL.hraciePole.riadky;
        }
        if(poziciaX > ALL.hraciePole.riadky)
        {
            this.poziciaX = 1;
        }
    }
    
    public void zmenY(int posun)
    {
        this.poziciaY += posun;
        if(poziciaY < 1)
        {
            this.poziciaY = ALL.hraciePole.riadky;
        }
        if(poziciaY > ALL.hraciePole.riadky)
        {
            this.poziciaY = 1;
        }
    }
    
}
