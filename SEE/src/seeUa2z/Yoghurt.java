package seeUa2z;

import seeUa2.Cereal;

public class Yoghurt extends Zutaten {

	Cereal m�sli;

	public Yoghurt(Cereal m�sli) {
		this.m�sli = m�sli;
	}

	public double getPrice() {
		return m�sli.getPrice() + 0.5;
	}

	public String getDescription() {
		return m�sli.getDescription() + "Passend zur Di�t \n";
	}

}
