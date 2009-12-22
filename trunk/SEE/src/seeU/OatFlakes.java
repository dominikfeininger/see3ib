package seeU;

public class OatFlakes extends Cereal {

	//boolean straw, boolean pea, boolean choc, boolean yog, boolean ban
	public OatFlakes(boolean straw, boolean pea, boolean choc, boolean yog, boolean ban) {
		super(straw,  pea,  choc,  yog,  ban);
		
	}

	
public double getPrice() {
		
		return super.getPrice() + 3;
	}

	public String getDescription() {
		String name= "OatFlakes: \n";
		name +=super.getDescription();
		return name;
	}
	
	
}
