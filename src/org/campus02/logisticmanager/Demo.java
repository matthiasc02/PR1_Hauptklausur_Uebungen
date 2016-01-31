package org.campus02.logisticmanager;

import java.util.ArrayList;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		LogisticManager Manager = new LogisticManager();
		
		Car Auto = new Car("VW Golf", "Green", 1400);
		Auto.move("Wien");
		Car Auto2 = new Car("Porsche", "Weiss", 1350);
		System.out.println();
		
		Manager.addMoveable(Auto);
		Manager.addMoveable(Auto2);
		
		Manager.moveAll("Wien");
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(Auto);
		cars.add(Auto2);
		System.out.println();
		
		//Ausgabe der Hash Map --> Auto Farbe + Anzahl
		System.out.println(getCarsByColor(cars));
		
	}

	public static HashMap<String, Integer> getCarsByColor(ArrayList<Car> cars){
		
		//Hash Map bauen
		HashMap<String, Integer> groupbyColor = new HashMap<>();
		
		//Schleife zum durchlaufen aller Einträge
		for (Car car : cars) {
			//Kontrolle ob Farbe schon existiert
			//wenn nein mit dem Wert 1 einfügen
			if (!groupbyColor.containsKey(car.color)){
				groupbyColor.put(car.color, 1);
			}
			else 
			{
				//Farbe gibt es schon
				//wert auslesen
				Integer value = groupbyColor.get(car.color);
				//erhöhen
				value+=1;
				//wieder setzen
				groupbyColor.put(car.color, value);
			}
		}		
		return groupbyColor;
	}


}
