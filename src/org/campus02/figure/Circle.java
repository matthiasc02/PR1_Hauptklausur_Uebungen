package org.campus02.figure;

public class Circle extends Figure{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double getPerimeter() {
		return (radius*2*Math.PI);
	}

	@Override
	double getArea() {
		return (radius*radius*Math.PI);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	
	
}
