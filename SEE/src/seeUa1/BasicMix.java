package seeUa1;

public class BasicMix extends Cereal {

	
	//boolean straw, boolean pea, boolean choc, boolean yog, boolean ban
	public BasicMix(boolean straw, boolean pea, boolean choc, boolean yog, boolean ban) {
		super( straw,  pea,  choc,  yog,  ban);
		
	}

	
	public double getPrice() {
		
		return super.getPrice() + 2.5;
	}

	public String getDescription() {
		String name= "Basic Mix: \n";
		name +=super.getDescription();
		return name;
	}
	
}
