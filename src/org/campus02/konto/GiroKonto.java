package org.campus02.konto;

public class GiroKonto extends Konto {
	private double limit;

	public GiroKonto(String inhaber, double limit) {
		super(inhaber);
		this.limit=limit;
	}

	@Override
	public void auszahlen(double wert) {
		if(kontostand-wert < limit*-1){
			System.out.println("Limit überschritten!");
		}
		else{
			kontostand-=wert;
		}

	}

}
