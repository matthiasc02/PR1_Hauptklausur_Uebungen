package org.campus02.logisticmanager;

public class Car implements Moveable {
	private String type;
	protected String color;
	private double weight;

	public Car(String type, String color, double weight) {
		super();
		this.type = type;
		this.color = color;
		this.weight = weight;
	}

	@Override
	public void move(String destination) {
		System.out.println(color + " " + type + " will be moved to " + destination);
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", color=" + color + ", weight=" + weight + "]";
	}
}
