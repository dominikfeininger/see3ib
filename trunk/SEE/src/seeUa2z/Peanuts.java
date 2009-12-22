package seeUa2z;

import seeUa2.Cereal;

public class Peanuts extends Decorator {

	Cereal müsli;

	public Peanuts(Cereal müsli) {
		this.müsli = müsli;
	}

	public double getPrice() {
		return müsli.getPrice() + 0.5;
	}

	public String getDescription() {
		return müsli.getDescription() + "Für die Nussfreunde \n";
	}

}
