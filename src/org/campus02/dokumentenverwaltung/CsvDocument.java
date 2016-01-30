package org.campus02.dokumentenverwaltung;

import java.util.ArrayList;

public class CsvDocument extends Document {
	private ArrayList<String> lines = new ArrayList<>();

	public CsvDocument(String fileName, ArrayList<String> lines) {
		super(fileName);
		this.lines = lines;
	}
	
	public void addLine(String line){
		lines.add(line);
	}
	
	@Override
	public void printDocument() {
		System.out.println("Csv Dokument: "+fileName+" => ");
		for(String string : lines){
			System.out.println(string);
		}
	}

}
