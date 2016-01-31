package org.campus02.figure;

public class Demo {

	public static void main(String[] args) {

		Rectangle q1 = new Rectangle(4, 2);
		System.out.println("Umfang: " + q1.getPerimeter());
		System.out.println("Fläche: " + q1.getArea());

		Circle c1 = new Circle(4);
		System.out.println("Umfang: " + c1.getPerimeter());
		System.out.println("Fläche: " + c1.getArea());
		
		FigureManager manager = new FigureManager();
		manager.addFigure(c1);
		manager.addFigure(q1);
		
		System.out.println("MAX Perimeter: "+manager.getMaxPerimeter());
		System.out.println("Durchschnittsgröße: "+ manager.getAvarageAreaSize());
		
		//Hash Map mit gesamtfläche je Kategorie
		System.out.println();
		System.out.println(manager.getAreaBySizeCategories());
	}

}
