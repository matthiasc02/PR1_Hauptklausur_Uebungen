package org.campus02.tiereabstrakt;

public class Bird extends Animal implements Fly {

	public Bird(String color, int countEyes) {
		super(color, countEyes);
	}

	@Override
	public void walk() {
		System.out.println("step by step");
	}

	@Override
	public void makeNoise() {
		System.out.println("piep piep");
	}

	@Override
	public void fly() {
		System.out.println("flying in the air");
	}

}
