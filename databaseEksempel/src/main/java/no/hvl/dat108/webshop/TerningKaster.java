package no.hvl.dat108.webshop;

import java.util.Random;

public class TerningKaster {
	private int terningkast;
	private int sekserePaaRad;
	public TerningKaster() {
		this.terningkast=0;
		this.sekserePaaRad=0;
	}
	public int kastTerning(){
		Random random = new Random();
		this.terningkast=1 + random.nextInt(6);
		if(terningkast==6) {
			sekserePaaRad++;
		}
		return this.terningkast;
	}
	public int getAntSeksere() {
		return this.sekserePaaRad;
	}
	public void restetAntSeksere() {
		sekserePaaRad=0;
	}
	public int getTerningKast() {
		return this.terningkast;
	}
	public void setTilTreSeksere() {
		this.sekserePaaRad=3;
	}
}
