package no.hvl.dat108.webshop;

import java.util.ArrayList;
import java.util.List;

public class Rute {

	private int id;
	private Rute neste;
	private Rute flytteverdi;
	boolean stigeslange;
	List<Spiller> spillerliste;
	
	public Rute(int id) {
		this.id = id;
		this.neste = null;
		this.flytteverdi = null;
		this.stigeslange = false;
		spillerliste = new ArrayList<Spiller>();
	}
	
	public void leggSpillerPaaRute(Spiller spiller) {
		spillerliste.add(spiller);
	}
	
	public List<Spiller> getSpillerListe(){
		return this.spillerliste;
	}
	
	public int getId() {
		return this.id;
	}

	public Rute getNeste() {
		return neste;
	}

	public void setNeste(Rute neste) {
		this.neste = neste;
	}

	public Rute getFlytteverdi() {
		return flytteverdi;
	}

	public void setFlytteverdi(Rute flytteverdi) {
		this.flytteverdi = flytteverdi;
	}

	public boolean isStigeslange() {
		return stigeslange;
	}

	public void setStigeslange(boolean stigeslange) {
		this.stigeslange = stigeslange;
	}
	
	
	
}
