package org.campus02.tiereabstrakt;

public abstract class Animal {
	private String color;
	private int countEyes;
	
	public Animal(String color, int countEyes) {
		this.color = color;
		this.countEyes = countEyes;
	}
	
	public abstract void walk();
	
	public abstract void makeNoise();
	

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Animal [color=" + color + ", countEyes=" + countEyes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + countEyes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (countEyes != other.countEyes)
			return false;
		return true;
	}



}
