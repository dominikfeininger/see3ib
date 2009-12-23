package seeUa2;


public class ChocoholicBoons extends Decorator {

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
