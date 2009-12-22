package seeUa2z;

import seeUa2.Cereal;

public class Peanuts extends Decorator {

	Cereal m�sli;

	public Peanuts(Cereal m�sli) {
		this.m�sli = m�sli;
	}

	public double getPrice() {
		return m�sli.getPrice() + 0.5;
	}

	public String getDescription() {
		return m�sli.getDescription() + "F�r die Nussfreunde \n";
	}

}
