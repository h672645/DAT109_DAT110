package no.hvl.dat108.webshop;

import java.util.Random;

public class Spiller {
	
	private String navn;
	private int rutelokasjon;

	private TerningKaster terning;

	private TerningKaster terningKaster;
	
	public void Spilltrekk() {
		//TODO.....
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
