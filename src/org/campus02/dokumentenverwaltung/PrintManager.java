package org.campus02.dokumentenverwaltung;

import java.util.ArrayList;

public class PrintManager{
	private ArrayList<Document> printdokument = new ArrayList<>();
		
	public void addDocument(Document d){
		printdokument.add(d);
	}
	
	public void printDocument(){
		for (Document document : printdokument) {
			document.printDocument();
		}
	}
	
	public Document findDocument(String fileName){
		for (Document document : printdokument) {
			if(document.fileName.equals(fileName)){
				return document;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "PrintManager [printdokument=" + printdokument + "]";
	}

	
}
