package seeUa2;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cereal müsli1 = new BasicMix();
		müsli1 = new Yoghurt(müsli1);
		müsli1 = new Peanuts(müsli1);
		müsli1 = new SumDeko(müsli1);
		System.out.println(müsli1.getDescription());
		System.out.println("Preis: " + müsli1.getPrice());

		System.out.println();
		System.out.println();

		Cereal müsli2 = new CrunchyNuts();
		müsli2 = new BananaChocs(müsli2);
		müsli2 = new BananaChocs(müsli2);
		müsli2 = new Strawberries(müsli2);
		müsli2 = new Yoghurt(müsli2);
		müsli2 = new Yoghurt(müsli2);
		müsli2 = new SumDeko(müsli2);
		System.out.println(müsli2.getDescription());
		System.out.println("Preis: " + müsli2.getPrice());

		System.out.println();
		System.out.println();

		Cereal müsli3 = new OatFlakes();
		müsli3 = new Peanuts(müsli3);
		müsli3 = new ChocoholicBoons(müsli3);
		müsli3 = new ChocoholicBoons(müsli3);
		müsli3 = new ChocoholicBoons(müsli3);
		müsli3 = new SumDeko(müsli3);
		System.out.println(müsli3.getDescription());
		System.out.println("Preis: " + müsli3.getPrice());

		System.out.println();
		System.out.println("Gesamt: " + SumDeko.returnPrice());
	}

}
