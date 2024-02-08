package no.hvl.dat109;

import java.util.Random;

public class Spiller {
	
	private String navn;
	private int rutelokasjon;
	
	public Spiller() {
		this.rutelokasjon = 1;
	}
	
	public Spiller(String navn) {
		this.navn = navn;
		this.rutelokasjon = 1;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getRutelokasjon() {
		return rutelokasjon;
	}

	public void setRutelokasjon(int rutelokasjon) {
		this.rutelokasjon = rutelokasjon;
	}
	
	
	
}
