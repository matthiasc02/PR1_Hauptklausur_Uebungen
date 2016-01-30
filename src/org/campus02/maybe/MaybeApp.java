package org.campus02.maybe;

import java.util.GregorianCalendar;

public class MaybeApp {

	public static void main(String[] args) {
		
		//maybeint
		
		MayBeInt Zahl1 = new MayBeInt(10, 1);
		MayBeInt Zahl2 = new MayBeInt(10, 2);
		MayBeInt Zahl3 = new MayBeInt(10, 3);
		MayBeInt Zahl4 = new MayBeInt(10, 4);
		
		System.out.println(Zahl1.print());
		System.out.println(Zahl2.print());
		System.out.println(Zahl3.print());
		System.out.println(Zahl4.print());
		
		System.out.println("-----------------------");
		
		//maybe Data

		MayBe<String> Name = new MayBe<String> ("Test",MayBe.ZugriffErlaubt);
		
		Name.print();
		Name.setStatus(MayBe.ZugriffVerboten);
		Name.print();
		
		System.out.println("-----------------------");

		MayBe<Integer> gehalt = new MayBe<Integer> (1000,MayBe.ZugriffErlaubt); 
		gehalt.print();
		
		System.out.println("-----------------------");

		
		MayBe<GregorianCalendar> Geb= 
				new MayBe<GregorianCalendar>
			(new GregorianCalendar(2015,10,10),MayBe.ZugriffErlaubt);
		Geb.print();

	}

}
