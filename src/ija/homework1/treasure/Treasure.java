package ija.homework1.treasure;

/**
 * Trieda, reprezentujuca poklad, hodnotu aku ma 
 * @author Filip Gulan (xgulan00)
 * @author Eduard Rybar (xrybar04)
 */
public class Treasure 
{
	public int code; // kod ktorym je poklad identifikovany
	static Treasure[] setPokladov = new Treasure[24]; //set viacerych pokladov

	/**
	 * Inicializuje poklad
	 * @param code nastavime jeho code
	 */
	private Treasure(int code)
	{
		this.code = code;
	}
	
	
	/**
	 * Metoda vytvori set pokladov, presnejsie 24 pokladov a ulozi ich do pola=set
	 */
	public static void createSet()
	{
		for(int i = 0; i < 24; i++) //vytvorime 24 pokladov
		{
			setPokladov[i] =  new Treasure(i);
		}
	}
	
	/**
	 * Metoda vracia objekt pokladu s odpovedajucim kodom
	 * @param code podla ktoreho  vracia objekt s danym kodom
	 * @return vracia prvok ak sa najde, inak vracia null
	 */
	public static Treasure getTreasure(int code)
	{
		for(Treasure poklad : setPokladov) //prehladavam cely 
		{
			if(poklad.code == code) //nasiel sa
			{
				return poklad;
			}
		}
		return null; //nenasiel sa
	}
        
        /**
         * Metoda na ziskanie hodnoty pokladu
         * @return hodnotu
         */
        public int getCode()
        {
            return this.code;
        }
}
