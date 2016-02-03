package org.campus02.product;

public class ProductDemo {

	public static void main(String[] args) {
		
		Product MotoG3 = new Product("Moto G 3", 20);
		Product Bildschirm = new Product("Bildschirm", 10);
		Product Glas = new Product("Glas", 5);
		Product Sensor = new Product("Sensor", 5);
		
		MotoG3.addPart(Bildschirm);
		Bildschirm.addPart(Glas);
		Bildschirm.addPart(Sensor);
		
		System.out.println(MotoG3.getPrice());
		//System.out.println(MotoG3.getPrices(MotoG3));
		
		System.out.println();
		
		//System.out.println(MotoG3.print(MotoG3, ""));
		System.out.println(MotoG3.print(""));
	}

}
