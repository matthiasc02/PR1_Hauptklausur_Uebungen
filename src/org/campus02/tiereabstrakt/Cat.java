package org.campus02.tiereabstrakt;

public class Cat extends Animal {
	private String name;
	
	public Cat(String color, int countEyes, String name) {
		super(color, countEyes);
		this.name = name;
	}
	
	@Override
	public void walk() {
		System.out.println("schleich schleich");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("mieau mieau");
	}


}
