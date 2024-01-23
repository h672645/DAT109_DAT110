package no.hvl.dat108.webshop;

import java.util.Random;

public class Spiller {

	private Rute rute;
	private String navn;
	
	public Spiller(String navn, Rute startrute) {
		this.rute = startrute;
		this.navn = navn;
	}
	
	public Rute getRute() {
		return rute;
	}
	public void setRute(Rute rute) {
		this.rute = rute;
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
}
