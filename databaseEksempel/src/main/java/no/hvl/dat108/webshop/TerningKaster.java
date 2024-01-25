package no.hvl.dat108.webshop;

import java.util.Random;

public class TerningKaster {
	private int terningkast;
	public TerningKaster() {
		this.terningkast=0;
	}
	public int kastTerning(){
		Random random = new Random();
		this.terningkast=1 + random.nextInt(5);
		return this.terningkast;
	}
}
