package seeUa2;


public class Strawberries extends Decorator {

	Cereal m�sli;

	public Strawberries(Cereal m�sli) {
		this.m�sli = m�sli;
	}

	public double getPrice() {
		return m�sli.getPrice() + 0.5;
	}

	public String getDescription() {
		return m�sli.getDescription() + "Fruchtig und frisch \n";
	}

}
