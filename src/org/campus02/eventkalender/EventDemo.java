package org.campus02.eventkalender;

public class EventDemo {

	public static void main(String[] args) {
		
		EventKalender kalender = new EventKalender();
		
		Event ev1 = new Event("Supergeil", "Graz", 500);
		kalender.add(ev1);
		Event ev2 = new Event("Krass", "Graz", 300);
		kalender.add(ev2);
		Event ev3 = new Event("Derb", "Graz", 200);
		kalender.add(ev3);
		
		
		System.out.println(kalender.getByTitle("Krass"));
		System.out.println();
		System.out.println(kalender.getByOrt("Graz"));
		System.out.println();
		System.out.println(kalender.getMostExpensiveByOrt("Graz"));
		System.out.println();
		System.out.println(kalender.getAvgPreisByOrt("Graz"));
		System.out.println();
		System.out.println(kalender.getCountByOrt());
	}

}
