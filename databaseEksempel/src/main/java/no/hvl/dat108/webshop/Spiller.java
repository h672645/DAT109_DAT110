package no.hvl.dat108.webshop;

import java.util.Random;

public class Spiller {
	
	private String navn;
	private int rutelokasjon;

	private TerningKaster terning;

	private TerningKaster terningKaster= new TerningKaster();
	
	public int Spilltrekk() {
		terningKaster.kastTerning();
		if(terningKaster.getAntSeksere()>=3) {
			if(terningKaster.getTerningKast()==6) {
				terningKaster.restetAntSeksere();
				return terningKaster.getTerningKast();
			}
			return 0;
		}
		else {
			if(terningKaster.getTerningKast()!=6) {
				terningKaster.restetAntSeksere();
				return terningKaster.getTerningKast();
			}
			else {
				return terningKaster.getTerningKast();
			}
		}
		//TODO.....
	}
	
	
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
	public TerningKaster getTerningen() {
		return this.terningKaster;
	}

	public void setRutelokasjon(int rutelokasjon) {
		this.rutelokasjon = rutelokasjon;
	}
	
	
	
}
