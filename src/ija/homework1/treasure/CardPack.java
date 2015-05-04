package ija.homework1.treasure;

import java.util.Random; //kniznica kvoi metode shuffle

/**
 * @author Filip Gulan xgulan00
 *
 */
public class CardPack
{
	public int maxSize; //maximum kariet pre dany balicek
	public int actSize; //aktualny poct kariet v balicku
	
	public TreasureCard[] balicek; //pole kariet = balicek
	
	/**
	 * Inicializuje balicek a naplni ho kartami
	 * @param maxSize maximum kariet pre dany balicek
	 * @param initSize startovaci pocet kariet v balicku
	 */
	public CardPack(int maxSize, int initSize)
	{
		if(maxSize >= initSize) //musi platit ze pociatocny pocet kariet v balicku je mensi ako maximalny
		{
			Treasure.createSet(); //vytvorime poklady aby sme ich mohli pridelit kartam balicku
			
			this.actSize = initSize; //nastavime aktualny pocet kariet na pocet aky ma pri inicializaci
			this.maxSize = maxSize; //nastavime balicku maximalny pocet kariet
			
			balicek = new TreasureCard[maxSize];
			for(int i = 0; i < initSize; i++) //naplnim balicek kartami
			{
				balicek[this.maxSize - i - 1] =  new TreasureCard(Treasure.getTreasure(i)); //v strede polla ale jendoduchsie ako od konca
			}
		}
	}
	
	/**
	 * Metoda na vyjmutie vrchnej karty z balicku
	 * @return vracia vrchnu kartu baliocku
	 */
	public TreasureCard popCard()
	{
		return balicek[--this.actSize];
	}
	
	/**
	 * Metoda na zistenie poctu kariet v balicku
	 * @return vracia aktualny ocet kariet v balicku
	 */
	public int size()
	{
		return this.actSize;
	}
	
	/**
	 * 
	 */
	public void shuffle()
	{
		int nahodnyIndex; //premenna na uchovanie vygenerovaneho nahodneho indexu
		TreasureCard pomocna; //pomocna premenna na prehodenie hodnot
		
		for(int i = 0; i < this.maxSize; i++) //prejdeme cely balicek
		{
			Random nahoda = new Random(); //vygenerujem nahodne cislo
			nahodnyIndex = nahoda.nextInt((this.actSize)); 
			
			pomocna = this.balicek[i]; //prehodime hodnoty kariet
			this.balicek[i] = this.balicek[nahodnyIndex];
			this.balicek[nahodnyIndex] = pomocna;
		}
	}
}
