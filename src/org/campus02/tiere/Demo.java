package org.campus02.tiere;

public class Demo {

	public static void main(String[] args) {
		
		Frog quaxi = new Frog("green", 2);
		Animal quaxiAsAnimal = quaxi;
		
		quaxi.makeNoise();
		quaxiAsAnimal.makeNoise();
		
		Frog quaxi2 = (Frog) quaxiAsAnimal;
		quaxi2.walk();
		
		//Nature List anlege
		Nature AnimalList = new Nature();
		//Tiere in die Liste einfügen
		AnimalList.addAnimal(quaxi);
		AnimalList.addAnimal(quaxiAsAnimal);
		AnimalList.addAnimal(quaxi2);
		//Farbe der Tiere ausgeben
		System.out.println(AnimalList.countColor("green"));

	}

}
