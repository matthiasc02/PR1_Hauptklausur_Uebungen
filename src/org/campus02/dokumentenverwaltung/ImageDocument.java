package org.campus02.dokumentenverwaltung;

public class ImageDocument extends Document {
	private int sizeX;
	private int sizeY;
	private String colour;
	
	public ImageDocument(String fileName, int sizeX, int sizeY, String colour) {
		super(fileName);
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.colour = colour;
	}
	
	@Override
	public void printDocument() {
		System.out.println("Image Dokument: "+ fileName+" => "+ "x: "+sizeX+" y: " + sizeY+" Farbe: " + colour);
	}

	@Override
	public String toString() {
		return "ImageDocument [sizeX=" + sizeX + ", sizeY=" + sizeY + ", colour=" + colour + "]";
	}

	


}
