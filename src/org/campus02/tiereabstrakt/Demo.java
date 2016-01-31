package org.campus02.tiereabstrakt;

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
		System.out.println();
		
		//Flugtier
		Bird b1=new Bird("green", 2);
		b1.walk();
		b1.makeNoise();
		b1.fly();		
		System.out.println();
		
		Dog d1=new Dog("balck", 2, "Flughund");
		d1.walk();
		d1.makeNoise();
		d1.fly();

	}

}
