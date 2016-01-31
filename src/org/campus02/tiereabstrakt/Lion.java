package org.campus02.tiereabstrakt;

public class Lion extends Animal {

	public Lion(String color, int countEyes) {
		super(color, countEyes);
	}
	
	@Override
	public void walk() {
		System.out.println("majestätisches schleichen");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("leises brüllen");
	}
	
	public void roar(){
		System.out.println("brüll brüll roar");
	}

}
