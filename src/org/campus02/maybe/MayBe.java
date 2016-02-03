package org.campus02.maybe;

public class MayBe<T> {
	public static final int ZugriffErlaubt =1;
	public static final int ZugriffVerboten =2;
	public static final int KeineDaten = 3;
	
	private T data;
	private int status;
	
	public MayBe(T data, int status) {
		this.data = data;
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public int getStatus() {
		return status;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	/*
	//zu verwenden wenn ausgegeben werden soll
	public void print(){
		switch(status){
		case ZugriffErlaubt: {
			System.out.println("Zugriff gestattet "+data);
			break;
		}
		case ZugriffVerboten: {
			System.out.println("Zugriff nicht gestattet");
			break;
		}
		case KeineDaten: {
			System.out.println("Nicht erfasst ");
			break;
		}
		default: {
			System.out.println("Ung�ltiger Status!");
			break;
		}
		
		}
		*/
		
	//L�sung @overide f�r String ausgabe
	//String toString
		public String toString(){
			switch(status){
			case 1: return "Zugriff gestattet: "+data;
			case 2: return "Zugriff nicht gestattet";
			case 3: return "Nicht erfasst ";
			default: return "Ung�ltiger Status!";
			}
		}
	
}
