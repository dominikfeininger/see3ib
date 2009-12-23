package seeUa2;


public class Strawberries extends Decorator {

	Cereal müsli;

	public Strawberries(Cereal müsli) {
		this.müsli = müsli;
	}

	public double getPrice() {
		return müsli.getPrice() + 0.5;
	}

	public String getDescription() {
		return müsli.getDescription() + "Fruchtig und frisch \n";
	}

}
