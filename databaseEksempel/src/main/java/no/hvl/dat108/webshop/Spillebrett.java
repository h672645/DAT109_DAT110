package no.hvl.dat108.webshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Spillebrett {

	private String navn;
	private final int antallruter = 100;
	private int antallspillere;
	private final int MAXSPILLERE = 8;
	private Queue<Spiller> koe;
	private List<Rute> rutebrett;
	
	public Spillebrett(int antallruter) {
		this.navn = "Stige/Slange-spill";
		this.antallspillere = 0;
		
		opprettRuteBrett(antallruter);
	}
	
	public void leggTilSpiller(String navn, Rute startrute) {
		if(koe.size() <= 8) {
			koe.add(new Spiller(navn, startrute));
		}
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getAntallspillere() {
		return antallspillere;
	}

	public void setAntallspillere(int antallspillere) {
		this.antallspillere = antallspillere;
	}

	public Queue<Spiller> getKoe() {
		return koe;
	}

	public void setKoe(Queue<Spiller> koe) {
		this.koe = koe;
	}
	
	public void opprettRuteBrett(int antallruter) {
		
		for(int i = 1; i <= 100; i++) {
			Rute nyrute = new Rute(i);
			Random random = new Random();
			if(random.nextInt(1,11) < 3) {
				nyrute.setStigeslange(true);
				nyrute.setFlytteverdi(random.nextInt(1,4));
			};
			this.rutebrett.add(new Rute(i));
		}
	}
	
}
