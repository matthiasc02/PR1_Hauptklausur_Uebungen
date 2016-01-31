package org.campus02.tiereabstrakt;

import java.util.ArrayList;

public class Nature {
	ArrayList<Animal> Animal = new ArrayList<>();
	
	public void addAnimal(Animal a){
		Animal.add(a);
	}
	
	public int countColor(String color){
		int counter=0;
		for (Animal animal : Animal) {
			if(animal.getColor().equals(color)){
				counter++;
			}
		}
		
		return counter;
	}

}
