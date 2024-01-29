package no.hvl.dat108.webshop;

import java.util.ArrayList;
import java.util.List;

public class Rute {
	//tror dere at det er bedre å la Ruten inneholde både stige,slange og rutenummer ??
	private Stiger stige;
	private Slanger slange;
	private Integer rutenummer;

	private int verdi;
	
	public Rute() {
	}
	
	public Rute(int x) {
		this.rutenummer= x;
		this.slange= new Slanger();
		this.stige= new Stiger();
		this.verdi = 0;
	}
	// getter
	public Integer getRutenummer(){
		return rutenummer;
	}

	public Slanger getSlange(){
		return this.slange;
	}
	public Stiger getStiger (){
		return this.stige;
	}

	//Setter
	public void setRutenummer(int rutenummer){
		this.rutenummer=rutenummer;
	}

	public void setSlanger(Slanger slange){
		slange=this.slange;
	}
	public void setStige(Stiger stige ){
		stige =this.stige;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}
	
	
}
