package org.campus02.eventkalender;

public class Event {
	private String Title;
	private String Ort;
	private double Eintrittspreis;
	public String getTitle() {
		return Title;
	}
	
	public Event(String title, String ort, double eintrittspreis) {
		Title = title;
		Ort = ort;
		Eintrittspreis = eintrittspreis;
	}

	public String getOrt() {
		return Ort;
	}
	public double getEintrittspreis() {
		return Eintrittspreis;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public void setOrt(String ort) {
		Ort = ort;
	}
	public void setEintrittspreis(double eintrittspreis) {
		Eintrittspreis = eintrittspreis;
	}
	
	@Override
	public String toString() {
		return "Event [Title=" + Title + ", Ort=" + Ort + ", Eintrittspreis=" + Eintrittspreis + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Eintrittspreis);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Ort == null) ? 0 : Ort.hashCode());
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
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
		Event other = (Event) obj;
		if (Double.doubleToLongBits(Eintrittspreis) != Double.doubleToLongBits(other.Eintrittspreis))
			return false;
		if (Ort == null) {
			if (other.Ort != null)
				return false;
		} else if (!Ort.equals(other.Ort))
			return false;
		if (Title == null) {
			if (other.Title != null)
				return false;
		} else if (!Title.equals(other.Title))
			return false;
		return true;
	}
	
	

}
