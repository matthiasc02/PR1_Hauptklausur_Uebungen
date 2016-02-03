package org.campus02.figure;

public class Cube extends Figure implements ThreeD{
	private double lenght;
	private double width;
	private double depth;

	@Override
	public double getVolume() {
		return lenght*width*depth;
	}

	@Override
	double getPerimeter() {
		return 4*lenght+4*width+4*depth;
	}

	@Override
	double getArea() {
		return 2*(lenght*width)+2*(lenght*depth)+2*(width*depth);
	}

}
