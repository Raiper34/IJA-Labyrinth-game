package ija.homework2.board;

import ija.elements.ALL;
import java.util.Random;

/**
 * @author eduardRybar
 * @author raiper34
 *Trieda reprezentujuca hraciu desku
 */
public class MazeBoard 
{
	public int stlpce; //pravdepodobne staci iba sirka, kedze to je stvorcove ale pre kazdy pripad do buducnosti....
	public int riadky;
	public MazeField plocha[][]; //dana plocha, na ktoru sa umiestnuju karty
	public MazeCard volnaKarta; //volna karta, ktora nnei na ploche
	
	/**
	 * Konstruktor, triedy iba poviem ako velka bude plocha 
	 * @param riadky
	 * @param stlpce
	 */
	public MazeBoard(int riadky, int stlpce) 
	{
		this.stlpce = stlpce;
		this.riadky = riadky;
		this.volnaKarta = null;
		this.plocha = new MazeField[riadky + 1][stlpce + 1];
	}

	/**
	 * Vytvori hraciu pplochu a naplni plochu prazdnymi polickami
	 * @param n - rozmer hracej dosky
	 * @return vytvorena hracia doska
	 */
	public static MazeBoard createMazeBoard(int n)
	{
		MazeBoard deska = new MazeBoard(n, n);
		for(int i = 1; i <= n; i++) //po riadkoch
		{
			for(int j = 1; j <= n; j++) //po stlpcoch
			{
				deska.plocha[i][j] = new MazeField(i, j); //na plochu umiestnim policko
			}
		}
                System.out.println("Vytvoril som hraciu desku o velkosti: " + n);
		return deska;
		
	}
	
	/**
	 * Funkcia, ktora naplni vsetky policka kartami
	 */
	public void newGame()
	{
                int c = 0;
                int f = 0;
                int l = 0;
                String nahodnaHodnota;
		for(int i = 1; i <= this.riadky; i++) //idem po riadkoch
		{
			for(int j = 1; j <= this.stlpce; j++) //idem po stlpcoch
			{
                            //aby to bolo 1:1:1
                            nahodnaHodnota = random();
                                
				if(i == 1)
				{
					if(j == this.stlpce) //pravehorne
					{
						this.plocha[i][j].karta = MazeCard.create("C");
                                                this.plocha[i][j].karta.turnLeft();
					}
					else if(j == 1) //lavehorne
					{
						this.plocha[i][j].karta = MazeCard.create("C");
                                                this.plocha[i][j].karta.turnRight();
                                                this.plocha[i][j].karta.turnRight();
					}
                                        else if((j%2) == 1) //neparne na horizotnelnej hornej
                                        {
                                            this.plocha[i][j].karta = MazeCard.create("F");
                                            this.plocha[i][j].karta.turnRight();
                                            this.plocha[i][j].karta.turnRight();
                                        }
                                        else
                                        {
                                            this.plocha[i][j].karta = MazeCard.create(nahodnaHodnota);
                                            randNatocenie(i,j);
                                        }
				}
				else if(i == this.riadky)
				{
					if(j == this.stlpce) //pravydolny roh
					{
                                            this.plocha[i][j].karta = MazeCard.create("C");
                                            //this.plocha[i][j].karta.turnLeft();
					}
					else if(j == 1) //lavedolne
					{
                                            this.plocha[i][j].karta = MazeCard.create("C");
                                            this.plocha[i][j].karta.turnRight();
					}
                                        else if((j%2) == 1 && (i%2) == 1) //horizontalny dolny riadok
                                        {
                                            this.plocha[i][j].karta = MazeCard.create("F");
                                        }
                                        else
                                        {
                                            this.plocha[i][j].karta = MazeCard.create(nahodnaHodnota);
                                            randNatocenie(i,j);
                                        }
				}
                                else if((j%2) == 1 && (i%2) == 1) //vertikalne stlpce
                                {
                                    if(j == this.stlpce)
                                    {
                                        this.plocha[i][j].karta = MazeCard.create("F");
                                        this.plocha[i][j].karta.turnLeft();
                                    }
                                    else if(j == 1)
                                    {
                                        this.plocha[i][j].karta = MazeCard.create("F");
                                        this.plocha[i][j].karta.turnRight();
                                    }
                                    else
                                    {
                                        this.plocha[i][j].karta = MazeCard.create(nahodnaHodnota);
                                        randNatocenie(i,j);
                                    }
                                }
				else
				{
                                    this.plocha[i][j].karta = MazeCard.create(nahodnaHodnota);
                                    randNatocenie(i,j);
				}
                                
                                switch (nahodnaHodnota) //kvoli 1:1:1
                                {
                                    case "C":
                                        c++;
                                        break;
                                    case "F":
                                        f++;
                                        break;
                                    default:
                                        l++;
                                        break;
                                }
			}
		}
                //naplnenie ulohovymi kartami
                for(int i = 1; i <= this.riadky; i++) //idem po riadkoch
		{
			for(int j = 1; j <= this.stlpce; j++) //idem po stlpcoch
			{
                            this.plocha[i][j].karta.uloha = 1;
                            
                        }
                }
		this.volnaKarta = MazeCard.create(random()); //vytvorim volnu kartu
	}
        
        public void randNatocenie(int i, int j)
        {
            Random nahoda = new Random();
            int nahodnyIndex = nahoda.nextInt(4);
            for(int q = 0; q < nahodnyIndex; q++)
            {
                this.plocha[i][j].karta.turnRight();
            }
        }
	
	/**
	 * Funkcia na nahodne generovanie typu karty
	 * @return
	 */
	public String random()
	{
		Random nahoda = new Random();
		int nahodnyIndex = nahoda.nextInt(3); 
		if(nahodnyIndex == 0)
		{
			return "C";
		}
		else if(nahodnyIndex == 1)
		{
			return "L";
		}
		else
		{
			return "F";
		}
	}
	
	/**
	 * Funkcia ktora viacia policko na pozici r c
	 * @param r riadok
	 * @param c stlpec
	 * @return policko
	 */
	public MazeField get(int r, int c)
	{
		if(r > this.riadky | c > this.stlpce | 1 < this.riadky | 1 < this.stlpce) //musi byt v tomto rozmedzi aby sa nieco vratilo
		{
			return this.plocha[r][c];
		}
		else //inak sa mimo nic nenachadza
		{
			return null;
		}
	}
	
	/**
	 * Funkcia vracia volnu kartu
	 * @return volna karta
	 */
	public MazeCard getFreeCard()
	{
		return this.volnaKarta;
		
	}
	
	/**
	 * Funkcia, ktora vlozi kartu na poziciu policka mf
	 * @param mf - policko ktore posuvam
	 */
	public void shift(MazeField mf)
	{
		if((mf.row == 1) & ((mf.col % 2) == 0)) //karty sa posunu dole v stlpci
		{
			MazeCard pomocna = this.volnaKarta; //aby som nestratil kartu
			this.volnaKarta = this.plocha[this.riadky][mf.col].karta; //do volnej karty si dam vytlacenu kartu
			for(int i = 0; i < this.stlpce - 1; i++) //idem po stlpci a postupne posuvam
			{
				this.plocha[this.riadky - i][mf.col].karta = this.plocha[this.riadky - i - 1][mf.col].karta;
			}
			this.plocha[1][mf.col].karta = pomocna; //nakoniec vlozim vou kartu
		} //analogie v podstate ine smery iba
		else if((mf.row == this.riadky) & ((mf.col % 2) == 0)) //karty sa posunu hore v stlpci
		{
			MazeCard pomocna = this.volnaKarta;
			this.volnaKarta = this.plocha[1][mf.col].karta;
			for(int i = 1; i <= this.stlpce - 1; i++)
			{
				this.plocha[i][mf.col].karta = this.plocha[i + 1][mf.col].karta;
			}
			this.plocha[this.riadky][mf.col].karta = pomocna;
		}
		else if((mf.col == 1) & ((mf.row % 2) == 0)) //karty sa posunu doprava na riadku
		{
			MazeCard pomocna = this.volnaKarta;
			this.volnaKarta = this.plocha[mf.row][this.stlpce].karta;
			for(int i = 0; i < this.stlpce - 1; i++)
			{
				this.plocha[mf.row][this.stlpce - i].karta = this.plocha[mf.row][this.stlpce - i - 1].karta;
			}
			this.plocha[mf.row][1].karta = pomocna;	
		}
		else if((mf.col != 1) & ((mf.row % 2) == 0)) //karty sa posunu dolava na riadku
		{
			MazeCard pomocna = this.volnaKarta;
			this.volnaKarta = this.plocha[mf.row][1].karta;
			for(int i = 1; i <= this.stlpce - 1; i++)
			{
				this.plocha[mf.row][i].karta = this.plocha[mf.row][i + 1].karta;
			}
			this.plocha[mf.row][this.stlpce].karta = pomocna;
		}
	}
}
