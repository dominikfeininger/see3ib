package seeUa2z;

import seeUa2.Cereal;

public class ChocoholicBoons extends Zutaten {

	Cereal müsli;

	public ChocoholicBoons(Cereal müsli) {
		this.müsli = müsli;
	}

	public double getPrice() {
		return müsli.getPrice() + 1.5;
	}

	public String getDescription() {
		return müsli.getDescription() + "Schokoladig genial \n";
	}

}
