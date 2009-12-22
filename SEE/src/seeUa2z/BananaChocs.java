package seeUa2z;

import seeUa2.Cereal;

public class BananaChocs extends Zutaten {

	Cereal müsli;

	public BananaChocs(Cereal müsli) {
		this.müsli = müsli;
	}

	public double getPrice() {
		return müsli.getPrice() + 1;
	}

	public String getDescription() {
		return müsli.getDescription() + "Fruchtig und süß \n";
	}

}
