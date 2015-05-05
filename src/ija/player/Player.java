package ija.player;

import ija.elements.AllMainObjects;

/**
 * Trieda, ktora predstavuje hraca
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class Player {

    public int poziciaX;
    public int poziciaY;
    public int uloha;
    public int ziskaneBody;
    
    /**
     * Konstruktor metody
     * @param poziciaX pociatocna suradnica X hraca
     * @param poziciaY pociatocna suradnica Y hraca
     * @param uloha ktoru ma dany rhac ziskat
     * @param ziskaneBody ktore ziskal
     */
    public Player(int poziciaX, int poziciaY, int uloha, int ziskaneBody)
    {
        this.poziciaX = poziciaX;
        this.poziciaY = poziciaY;
        this.uloha = uloha;
        this.ziskaneBody = ziskaneBody;
    }
    
    /**
     * Metoda, ktora zmeni suradnicu hraca podla pravidiel
     * @param posun hodsnota o ktoru hraca posuvam
     */
    public void zmenX(int posun)
    {
        this.poziciaX += posun;
        if(poziciaX < 1)
        {
            this.poziciaX = AllMainObjects.hraciePole.riadky;
        }
        if(poziciaX > AllMainObjects.hraciePole.riadky)
        {
            this.poziciaX = 1;
        }
    }
    
    /**
     * Metoda, ktora posuva hraca podla pravidiel
     * @param posun hodnotu o ktoru hraca posuvam
     */
    public void zmenY(int posun)
    {
        this.poziciaY += posun;
        if(poziciaY < 1)
        {
            this.poziciaY = AllMainObjects.hraciePole.riadky;
        }
        if(poziciaY > AllMainObjects.hraciePole.riadky)
        {
            this.poziciaY = 1;
        }
    }
    
}
