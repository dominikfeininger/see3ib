package seeUa2;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cereal m�sli1 = new BasicMix();
		m�sli1 = new Yoghurt(m�sli1);
		m�sli1 = new Peanuts(m�sli1);
		m�sli1 = new SumDeko(m�sli1);
		System.out.println(m�sli1.getDescription());
		System.out.println("Preis: " + m�sli1.getPrice());

		System.out.println();
		System.out.println();

		Cereal m�sli2 = new CrunchyNuts();
		m�sli2 = new BananaChocs(m�sli2);
		m�sli2 = new BananaChocs(m�sli2);
		m�sli2 = new Strawberries(m�sli2);
		m�sli2 = new Yoghurt(m�sli2);
		m�sli2 = new Yoghurt(m�sli2);
		m�sli2 = new SumDeko(m�sli2);
		System.out.println(m�sli2.getDescription());
		System.out.println("Preis: " + m�sli2.getPrice());

		System.out.println();
		System.out.println();

		Cereal m�sli3 = new OatFlakes();
		m�sli3 = new Peanuts(m�sli3);
		m�sli3 = new ChocoholicBoons(m�sli3);
		m�sli3 = new ChocoholicBoons(m�sli3);
		m�sli3 = new ChocoholicBoons(m�sli3);
		m�sli3 = new SumDeko(m�sli3);
		System.out.println(m�sli3.getDescription());
		System.out.println("Preis: " + m�sli3.getPrice());

		System.out.println();
		System.out.println("Gesamt: " + SumDeko.returnPrice());
	}

}
