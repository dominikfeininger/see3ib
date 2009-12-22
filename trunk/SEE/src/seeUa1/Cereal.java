package seeUa1;

public class Cereal {

	private boolean strawberries;
	private boolean peanuts;
	private boolean chocoholicBoons;
	private boolean yoghurt;
	private boolean bananaChocs;
	private String description="";

	private float price = 0;

	public Cereal(boolean straw, boolean pea, boolean choc, boolean yog, boolean ban) {

		strawberries=straw;
		peanuts=pea;
		chocoholicBoons=choc;
		yoghurt=yog;
		bananaChocs=ban;	
		
		
	}

	public double getPrice() {

		if (strawberries) {
			price += 0.5;
		}
		if (peanuts) {
			price += 0.5;
		}
		if (chocoholicBoons) {
			price += 1.5;
		}
		if (yoghurt) {
			price += 0.5;
		}
		if (bananaChocs) {
			price += 1;
		}

		return price;
	}

	public String getDescription() {
		if (strawberries) {
			description += "Fruchtig und frisch \n";
		}
		if (peanuts) {
			description += "Für die Nussfreunde \n";
		}
		if (chocoholicBoons) {
			description += "Schokoladig genial \n";
		}
		if (yoghurt) {
			description += "Passend zur Diät \n";
		}
		if (bananaChocs) {
			description += "Fruchtig und süß \n";
		}

		return description;
	}

}
