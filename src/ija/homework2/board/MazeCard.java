package ija.homework2.board;

/**
 * Trieda, reprezentujuca cestu, ktora je na danej suradnici
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class MazeCard 
{
	public CANGO left;
	public CANGO up;
	public CANGO right;
	public CANGO down;
        
        public int uloha;
	
	/**
	 * Konstruktor, ktory naplni svoje smeri bud null ak sa tede neda ist inak hodnotou enumeracie
	 * @param left ci je zadany cesta dolava
	 * @param up cesta hore
	 * @param right cesta pravo
	 * @param down cesta dole
	 */
	public MazeCard(CANGO left, CANGO up, CANGO right, CANGO down) 
	{
		this.left = left;
		this.up = up;
		this.right = right;
		this.down = down;
                this.uloha = -1;
	}

	/**
	 * Enumeracia, reprezentuje smer kade opustit kartu
	 */
	public static enum CANGO
	{
		LEFT,
		UP,
		RIGHT,
		DOWN,
                NULL
	}

	/**
	 * Metoda na vytvorenie karty
	 * @param type ktory urcuje typ vytvaranej karty
	 * @return vytvorenu kartu
	 */
	public static MazeCard create(String type)
	{
		if(type == "C") //typ rohova cesta zlava hore
		{
			MazeCard karta = new MazeCard(CANGO.LEFT, CANGO.UP, CANGO.NULL, CANGO.NULL);
			return karta;
		}
		else if(type == "L") //typrovna cesta, zlava doprava
		{
			MazeCard karta = new MazeCard(CANGO.LEFT, CANGO.NULL, CANGO.RIGHT, CANGO.NULL);
			return karta;
		}
		else if(type == "F") //typ rozdelena cesta, zlava nahoru doprava
		{
			MazeCard karta = new MazeCard(CANGO.LEFT, CANGO.UP, CANGO.RIGHT, CANGO.NULL);
			return karta;
		}
		else //inak neplatny argument funckie vypise chybu
		{
			throw new IllegalArgumentException("Kamen sa neda vytvorit!");
		}
		
	}
	
	/**
	 * Metoda na zistenie ci sa da opustit kartu danm smerom
	 * @param dir smer ktory testujeme ci nym mozme ist
	 * @return false ak sa nea opustit, inak vracia true ak mozme opustit
	 */
	public boolean canGo(MazeCard.CANGO dir)
	{
		
		if(dir == CANGO.LEFT)
		{
			if(this.left == CANGO.NULL)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else if(dir == CANGO.UP)
		{
			if(this.up == CANGO.NULL)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else if(dir == CANGO.RIGHT)
		{
			if(this.right == CANGO.NULL)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else if(dir == CANGO.DOWN)
		{
			if(this.down == CANGO.NULL)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Metoda na otocenie karty o 90 stupnov doprava
	 */
	public void turnRight()
	{
		CANGO pomocna;
		pomocna = this.left;
		this.left = this.down;
		this.down = this.right;
		this.right = this.up;
		this.up = pomocna;
	}
        
        /**
	 * Metoda na otocenie karty o 90 stupnov dolava
	 */
        public void turnLeft()
	{
		CANGO pomocna;
		pomocna = this.left;
		this.left = this.up;
		this.up = this.right;
		this.right = this.down;
		this.down = pomocna;
	}
}
