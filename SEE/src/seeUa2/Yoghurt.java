package seeUa2;


public class Yoghurt extends Decorator {

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
