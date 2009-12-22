package seeU;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// boolean straw, boolean pea, boolean choc, boolean yog, boolean ban
		Cereal müsli1 = new BasicMix(false, true, false, true, false);

		System.out.println(müsli1.getDescription());
		System.out.println("Preis: " + müsli1.getPrice());

		
		
		
		
	}

}
