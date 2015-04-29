package ija.homework1.treasure;

/**
 * @author Filip Gulan xgulan00
 *
 */
public class TreasureCard
{
	Treasure karta; //hracia karta
	
	/**
	 * Inicializcia karty 
	 * @param tr nastavime karte dany poklad
	 */
	public TreasureCard(Treasure tr)
	{
		this.karta = tr;
	}
        
        public Treasure getCard()
        {
            return this.karta;
        }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() { //automaticky vygenerovane eclipsom
		final int prime = 31;
		int result = 1;
		result = prime * result + ((karta == null) ? 0 : karta.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) { //automaticky vygenerovane eclipsom
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreasureCard other = (TreasureCard) obj;
		if (karta == null) {
			if (other.karta != null)
				return false;
		} else if (!karta.equals(other.karta))
			return false;
		return true;
	}
}
