package seeUa2;


public class BananaChocs extends Decorator {

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
