package ija.ui;

import ija.homework2.board.MazeBoard;
import ija.homework2.board.MazeField;
import ija.homework2.board.MazeCard;
import ija.homework2.board.MazeCard.CANGO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Testovacia trieda textoveho uzivatelskeho rozhrania
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class Tui
{
	MazeBoard hraciaPlocha; //uchovavam hraciu plochu, aby som sa k nej mohol dostat
	
	/**
         * Konstruktor triedy
	 * @param hraciaPlocha
	 */
	public Tui(MazeBoard hraciaPlocha)
	{
		this.hraciaPlocha = hraciaPlocha;
	}

	/**
	 * Metoda, ktora cita zprikazy zadane na stdin
	 */
	public void start() 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean koniec = false;
		
		while(!koniec) //aby to bolo neustale spustene a iba ak zadame q aby sa ukoncilo
		{
			try 
			{
				System.out.print("Zadajte prikaz$ ");
				System.out.flush(); //kvoli bufferu aby sa to vypisovalo v spravnom poradi
				String prikaz = in.readLine();
				koniec = vykonaj(prikaz);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	/**
	 * Funkcia na vykonanie akcie podla prikazu ktory sme zadali
	 * @param prikaz prikaz ktory sme dostali zo stdin 
	 * @return vracia to ci sme zadali prikaz ukoncenia a koncime program alebo nie
	 */
	private boolean vykonaj(String prikaz) 
	{
		boolean koniec = false;
		switch(prikaz)
		{
			case "p":
				this.zobrazPlochu();
                break;
			case "n":
				this.hraciaPlocha.newGame();
                break;
			case "q":
				koniec = true;
                break;
			default:
				if(prikaz.matches("s[0-9][0-9]"))
				{
					String prvy = prikaz.substring(1,2); //musim si zo stringu vytuiahnut suradnice
					String druhy = prikaz.substring(2,3);
					MazeField pomocny = this.hraciaPlocha.get(Integer.parseInt(prvy), Integer.parseInt(druhy));
					this.hraciaPlocha.shift(pomocny);
				}
				else
				{
					System.err.print("Chyba: Neznamy prikaz!\n");
					System.err.flush();
				}
                break;
              
				
		}
		return koniec;
	}
	
	/**
	 * Metoda ktora zobrazi hraciu plochu, kamene su reprezentovane nazornymi znakmi
	 */
	private void zobrazPlochu()
	{
		char oddelovac = 0x2551; //aby som mohol vytlacit znaky extended ASCII
		for(int i = 0; i <= this.hraciaPlocha.riadky; i++) //idem po riadkoch
		{
			System.out.print(i);
			System.out.print(oddelovac);
		}
		System.out.print("\n");
		for(int i = 1; i <= this.hraciaPlocha.riadky; i++) //idem po riadkoch
		{
			System.out.print(i);
			for(int j = 1; j <= this.hraciaPlocha.stlpce; j++) //idem po stlpcoch
			{
				MazeField policko = this.hraciaPlocha.get(i,j);
				System.out.print(oddelovac);
				zobrazPolicko(policko.getCard());
			}
			System.out.print(oddelovac);
			System.out.print("\n");
		}
		System.out.print("\nVolny kamen: "); //vytlacim policko a jeho kamen pre prehladnost oddelovace...
		System.out.print(oddelovac);
		zobrazPolicko(this.hraciaPlocha.volnaKarta);
		System.out.print(oddelovac);
		System.out.print("\n");
	}
	
	/**
	 * Metoda, ktora rozhoduje o symbole daneho policka
	 * @param karta karta ktorej symbol zobrazujem
	 */
	private void zobrazPolicko(MazeCard karta)
	{
		char znak = 'A';
		if(karta.up != CANGO.NULL)
		{
			if(karta.right != CANGO.NULL)
			{
				if(karta.down != CANGO.NULL) //hore doprava dole
				{
					znak = 0x251C;
					System.out.print(znak);
				}
				else if(karta.left != CANGO.NULL) //hore doprava lavo
				{
					znak = 0x2534;
					System.out.print(znak);
				}
				else //hore doprava 
				{
					znak = 0x2514;
					System.out.print(znak);
				}
			}
			else //nema smer doprava
			{
				if(karta.left != CANGO.NULL)
				{
					if(karta.down != CANGO.NULL)
					{
						znak = 0x2524;
						System.out.print(znak);
					}
					else
					{
						znak = 0x2518;
						System.out.print(znak);
					}
				}
				else
				{
					znak = 0x2502;
					System.out.print(znak);
				}
			}
		}
		else //nema smer hore
		{
			if(karta.right != CANGO.NULL) //ma smer doprava
			{
				if(karta.left != CANGO.NULL) //ma smer doprava
				{
					if(karta.down != CANGO.NULL) //ma smer doprava
					{
						znak = 0x252C;
						System.out.print(znak);
					}
					else
					{
						znak = 0x2500;
						System.out.print(znak);
					}
				}
				else
				{
					znak = 0x250C;
					System.out.print(znak);
				}
			}
			else
			{
				znak = 0x2510;
				System.out.print(znak);
			}
		}
	}
}
