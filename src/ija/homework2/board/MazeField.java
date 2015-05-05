package ija.homework2.board;

/**
 * Trieda, eprezentujuca jedno policko hracej plochy
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class MazeField 
{
	int row;
	int col; 
	public MazeCard karta; //karta ktora sa aktualne nachadza na policku
	
	/**
	 * Konstuktor, ktory vytvori prazdne policko na suradnici row col
	 * @param row
	 * @param col
	 */
	public MazeField(int row, int col) 
	{
		this.row = row;
		this.col = col;
		this.karta = null;
	}

	/**
	 * Funkcia vracia cislo riadku, na ktorom je policko umiestnene
	 * @return cislo riakdu
	 */
	public int row()
	{
		return this.row;
	}
	
	/**
	 * Funkcia vracia cislo stlpca na ktorom je policko umiestnene
	 * @return cislo stlpca
	 */
	public int col()
	{
		return this.col;
	}
	
	/**
	 * Vracia kartu, ktora sa nachadza na danom policku
	 * @return karta
	 */
	public MazeCard getCard()
	{
		return this.karta;
		
	}
	
	/**
	 * Vlozi kartu na dane policko
	 * @param c umiestnovana karta
	 */
	public void putCard(MazeCard c)
	{
		this.karta = c;
	}
}
