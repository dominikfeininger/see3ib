package seeUa2z;

import seeUa2.Cereal;

public class BananaChocs extends Zutaten {

	Cereal m�sli;

	public BananaChocs(Cereal m�sli) {
		this.m�sli = m�sli;
	}

	public double getPrice() {
		return m�sli.getPrice() + 1;
	}

	public String getDescription() {
		return m�sli.getDescription() + "Fruchtig und s�� \n";
	}

}
