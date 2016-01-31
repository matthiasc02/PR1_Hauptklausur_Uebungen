package org.campus02.logisticmanager;

public class Shirt implements Moveable {
	private String brand;
	private String size;
	private String color;

	public Shirt(String brand, String size, String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
	}

	@Override
	public void move(String destination) {
		System.out.println(color + " " + brand + " Shirt is moved to " + destination + " Size: " + size);
	}

	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", size=" + size + ", color=" + color + "]";
	}

}
