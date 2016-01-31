package org.campus02.tiereabstrakt;

public class Frog extends Animal {
	
	public Frog(String color, int countEyes) {
		super(color, countEyes);
	}
	
	@Override
	public void walk() {
		System.out.println("jump jump");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("quak quak");
	}

}
