package org.campus02.tiereabstrakt;

public class Dog extends Animal implements Fly{
	private String name;
	
	public Dog(String color, int countEyes, String name) {
		super(color, countEyes);
		this.name = name;
	}
	
	@Override
	public void walk() {
		System.out.println("lautes schleichen");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("wau wau");
	}

	@Override
	public void fly() {	
		System.out.println("Ich bin ein Flughund :-) YEAH");
	}



}
