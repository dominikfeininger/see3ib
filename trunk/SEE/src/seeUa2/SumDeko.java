package seeUa2;

import seeUa2.*;

public class SumDeko extends Decorator {

	Cereal müsli;
	static double umsatz = 0.0;

	public SumDeko(Cereal müsli) {
		this.müsli = müsli;
	}

	public double getPrice() {
		umsatz += müsli.getPrice();
		return müsli.getPrice();
	}

	public String getDescription() {
		return müsli.getDescription() + "Schokoladig genial \n";
	}

	static public double returnPrice() {
		
		return umsatz;
	}

}
