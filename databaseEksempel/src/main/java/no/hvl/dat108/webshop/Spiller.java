package no.hvl.dat108.webshop;

import java.util.Random;

public class Spiller {
	
	private String navn;
	private int rutelokasjon;

	private TerningKaster terning;

	private TerningKaster terningKaster= new TerningKaster();
	
	public void Spilltrekk() {
		terningKaster.kastTerning();
		if(terningKaster.getAntSeksere()>=3) {
			this.setRutelokasjon(1);
			if(terningKaster.getTerningKast()==6) {
				terningKaster.restetAntSeksere();
				this.setRutelokasjon(this.getRutelokasjon()+terningKaster.getTerningKast());
			}
		}
		else {
			this.setRutelokasjon(this.getRutelokasjon()+terningKaster.getTerningKast());
			if(terningKaster.getTerningKast()!=6) {
				terningKaster.restetAntSeksere();
			}
		}
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
	public TerningKaster getTerningen() {
		return this.terningKaster;
	}

	public void setRutelokasjon(int rutelokasjon) {
		this.rutelokasjon = rutelokasjon;
	}
	
	
	
}
