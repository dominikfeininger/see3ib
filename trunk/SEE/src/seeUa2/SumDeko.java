package seeUa2;

import seeUa2.*;

public class SumDeko extends Decorator {

	Cereal m�sli;
	static double umsatz = 0.0;

	public SumDeko(Cereal m�sli) {
		this.m�sli = m�sli;
	}

	public double getPrice() {
		umsatz += m�sli.getPrice();
		return m�sli.getPrice();
	}

	public String getDescription() {
		return m�sli.getDescription() + "Schokoladig genial \n";
	}

	static public double returnPrice() {
		
		return umsatz;
	}

}
