package org.campus02.dokumentenverwaltung;

public class TextDocument extends Document {
	protected String content;

	public TextDocument(String fileName, String content) {
		super(fileName);
		this.content=content;
	}
	
	@Override
	public void printDocument() {
		System.out.println("Text Dokument: "+fileName+" => "+content);
	}

	@Override
	public String toString() {
		return "TextDocument [content=" + content + "]";
	}

}
