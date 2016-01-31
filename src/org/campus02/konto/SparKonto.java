package org.campus02.konto;

public class SparKonto extends Konto {

	public SparKonto(String inhaber) {
		super(inhaber);
	}

	@Override
	public void auszahlen(double wert) {
		if(kontostand-wert < 0){
			System.out.println("Betrag zu hoch maximal "+kontostand+" möglich");
		} 
		else {
			kontostand-=wert;
		}
	}

}
