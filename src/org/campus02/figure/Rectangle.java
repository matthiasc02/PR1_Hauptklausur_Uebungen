package org.campus02.figure;

public class Rectangle extends Figure{
	private double lenght;
	private double width;
		
	public Rectangle(double lenght, double width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}

	@Override
	double getPerimeter() {
		return (2*lenght+2*width);
	}

	@Override
	double getArea() {
		return (lenght*width);
	}

	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", width=" + width + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(lenght);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
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
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(lenght) != Double.doubleToLongBits(other.lenght))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	
	

}
