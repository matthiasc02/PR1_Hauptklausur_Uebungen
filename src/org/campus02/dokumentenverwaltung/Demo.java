package org.campus02.dokumentenverwaltung;

import java.util.ArrayList;

import com.sun.org.apache.xml.internal.serialize.Printer;

public class Demo {

	public static void main(String[] args) {
		
		Document document = new Document("testdocument.txt");
		document.printDocument();
		
		TextDocument textdocument = new TextDocument("textdocument.txt", " das ist ein Textdokument");
		textdocument.printDocument();
		
		ImageDocument imagedocument = new ImageDocument("image.png", 100, 200, "red");
		imagedocument.printDocument();
		
		System.out.println();
		
		CsvDocument csvdocument = new CsvDocument("demo.csv", new ArrayList<String>());
		csvdocument.addLine("line;column2;usw");
		csvdocument.addLine("line;column2;usw");
		csvdocument.printDocument();
		
		System.out.println();
		
		CsvDocument csvdocument2 = new CsvDocument("demo2.csv", new ArrayList<String>());
		csvdocument2.addLine("line;column2;usw");
		csvdocument2.printDocument();

	}

}
