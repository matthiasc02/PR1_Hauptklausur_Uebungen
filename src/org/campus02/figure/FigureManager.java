package org.campus02.figure;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
	private ArrayList<Figure> figuremanager = new ArrayList<>();
	
	public void addFigure(Figure f){
		figuremanager.add(f);
	}
	
	public double getMaxPerimeter(){
		double perimeter=0.0;
		for (Figure figure : figuremanager) {
			if(perimeter < figure.getPerimeter()){
				perimeter=figure.getPerimeter();
			}
		}
		return perimeter;
	}
	
	public double getAvaragePerimeter(){
		double perimeter=0.0;
		int counter=0;
		for (Figure figure : figuremanager) {
			perimeter+=figure.getPerimeter();
			counter++;
		}
		return perimeter/counter;
	}
	
	public double getAvarageAreaSize(){
		double area=0.0;
		int counter=0;
		
		for (Figure figure : figuremanager) {
			area+=figure.getArea();
			counter++;
		}
		return area/counter;
	}
	
	HashMap<String, Double> getAreaBySizeCategories(){
		HashMap<String, Double> map= new HashMap<>();
		//Map mit parametern befüllen
		map.put("Klein", 0.0);
		map.put("Mittel", 0.0);
		map.put("Groß", 0.0);
		
		for (Figure figure : figuremanager) {
			if(figure.getArea()<1000){
				Double value = map.get("Klein");
				map.put("Klein", value+figure.getArea());
			}
			else if (figure.getArea()>1000 && figure.getArea()<5000){
				Double value = map.get("Mittel");
				map.put("Mittel", value+figure.getArea());
			}
			else {
				Double value = map.get("Groß");
				map.put("Groß", value+figure.getArea());
			}
		}
		
		return map;		
	}
	
	
}