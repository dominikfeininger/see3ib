package seeUa2z;

import seeUa2.Cereal;

public class ChocoholicBoons extends Zutaten {

	Cereal m�sli;

	public ChocoholicBoons(Cereal m�sli) {
		this.m�sli = m�sli;
	}

	public double getPrice() {
		return m�sli.getPrice() + 1.5;
	}

	public String getDescription() {
		return m�sli.getDescription() + "Schokoladig genial \n";
	}

}
