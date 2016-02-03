package org.campus02.product;

import java.util.ArrayList;

public class Product {
	private String Name;
	protected double price;
	private ArrayList<Product> Parts = new ArrayList<>();
			
	public Product(String name, double price) {
		super();
		Name = name;
		this.price = price;
	}
	
	public String getName() {
		return Name;
	}



	public ArrayList<Product> getParts() {
		return Parts;
	}


	public void addPart(Product p){
		Parts.add(p);
	}
	
	
	//rekursion
	
	public double getPrice() {
		double gesamtpreis = price;
		for (Product product : Parts) {
			gesamtpreis += product.getPrice();
		}
		return gesamtpreis;
	}
	
	/*
	//falsch übernommen, hier wird produkt übergeben sollte aber nicht so sein
	double getPrices(Product p){
		double prices=0.0;
		if (p.Parts.isEmpty()){
			return p.getPrice();
		}
		
		for (Product product : p.getParts()) {
			prices+=p.getPrice()+getPrices(product);
		}			
		return prices;
	}
	*/
	
	/*
	//falsch übernommen, hier wird produkt übergeben sollte aber nicht so sein
	String print(Product p, String ident){
		if (p.Parts.isEmpty()) {
			return ident+ p.getName()+" "+p.getPrice();
		}
		
		String result = ident+p.getName()+" "+p.getPrice()+"\n";
		for (Product product : p.getParts()){
			result += ident+print(product, " ")+"\n";			
		}		
		return result;	
	*/
	
	public String print(String ident){
			
		String result = ident + Name+" "+price+"\n";
		
		for (Product product : Parts) {
		result += ident + product.print(" ");
		}
		return result;
	}
	

}
