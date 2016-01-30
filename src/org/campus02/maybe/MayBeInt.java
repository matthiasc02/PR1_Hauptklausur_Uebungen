package org.campus02.maybe;

public class MayBeInt {
	private int data;
	private int status;
	
	public MayBeInt(int data, int status) {
		this.data = data;
		this.status = status;
	}

	public int getData() {
		return data;
	}

	public int getStatus() {
		return status;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public String print(){
		switch(status){
		case 1: return "Zugriff gestattet "+data;
		case 2: return "Zugriff nicht gestattet";
		case 3: return "Nicht erfasst ";
		default: return "Ungültiger Status!";
		}
	}
	
	

}
