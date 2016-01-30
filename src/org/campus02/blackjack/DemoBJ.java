package org.campus02.blackjack;

public class DemoBJ {

	public static void main(String[] args) {
		
		Player p1 = new Player("Max Mustermann", 20);
		Player p2 = new Player("Susi Sorglos", 19);
		
		BlackJack BJ = new BlackJack();
		BJ.add(p1);
		BJ.add(p2);
		
		System.out.println(p1.getName()+", Kartenwert: "+ BJ.getValue(p1));
		BJ.addCard(p1, 17);
		System.out.println(p2.getName()+", Kartenwert: "+ BJ.getValue(p2));
		BJ.addCard(p2, 20);
		System.out.println(p1.getName()+", Kartenwert: "+ BJ.getValue(p1));
		System.out.println(p2.getName()+", Kartenwert: "+ BJ.getValue(p2));
		

	}

}
