package org.campus02.tiereabstrakt;

public class Lion extends Animal {

	public Lion(String color, int countEyes) {
		super(color, countEyes);
	}
	
	@Override
	public void walk() {
		System.out.println("majest�tisches schleichen");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("leises br�llen");
	}
	
	public void roar(){
		System.out.println("br�ll br�ll roar");
	}

}
