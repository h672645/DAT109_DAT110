package no.hvl.dat108.webshop;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Rute", schema = "Dat109")
public class Rute {

	@Id
	private Integer rutenummer;
	private Integer verdi;
	
	public Rute() {
	}
	
	public Rute(Integer rutenummer) {
		this.rutenummer = rutenummer;
		this.verdi = 0;
	}
	
	public Integer getRutenummer(){
		return rutenummer;
	}

	public void setRutenummer(Integer rutenummer){
		this.rutenummer=rutenummer;
	}

	public Integer getVerdi() {
		return verdi;
	}

	public void setVerdi(Integer verdi) {
		this.verdi = verdi;
	}
	
}
