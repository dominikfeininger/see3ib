package seeUa1;

public class CrunchyNuts extends Cereal{

	//boolean straw, boolean pea, boolean choc, boolean yog, boolean ban
	public CrunchyNuts(boolean straw, boolean pea, boolean choc, boolean yog, boolean ban) {
		super(straw,  pea,  choc,  yog,  ban);
		
	}

	
public double getPrice() {
		
		return super.getPrice() + 4.5;
	}

	public String getDescription() {
		String name= "CrunchyNuts: \n";
		name +=super.getDescription();
		return name;
	}
	
	
	
}
