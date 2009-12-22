package seeUa2z;

import seeUa2.Cereal;

public class Yoghurt extends Decorator {

	Cereal müsli;

	public Yoghurt(Cereal müsli) {
		this.müsli = müsli;
	}

	public double getPrice() {
		return müsli.getPrice() + 0.5;
	}

	public String getDescription() {
		return müsli.getDescription() + "Passend zur Diät \n";
	}

}
