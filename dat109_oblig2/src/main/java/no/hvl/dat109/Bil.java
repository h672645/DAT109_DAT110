package no.hvl.dat109;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Bil" ,schema="Dat109")
public class Bil {
	@Id
	private String regNr;

	private String merke;
	private String model;
	private String farge;
	private String kategori;
	private boolean ledig;

	public Bil(){
	}
	public Bil(String regNr,String merke,String model,String farge,String kategori,boolean ledig){
             this.regNr=regNr;
			 this.merke=merke;
			 this.model=model;
			 this.farge=farge;
			 this.kategori=kategori;
			 this.ledig=ledig;
	};

	public String getRegNr() {
		return regNr;
	}

	public void setRegNr(String regNr) {
		this.regNr = regNr;
	}
	public String getMerke() {
		return merke;
	}
	public void setMerke(String merke) {
		this.merke = merke;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFarge() {
		return farge;
	}
	public void setFarge(String farge) {
		this.farge = farge;
	}
	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	public boolean erLedig() {
		return ledig;
	}
	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}
	
	
	
}
