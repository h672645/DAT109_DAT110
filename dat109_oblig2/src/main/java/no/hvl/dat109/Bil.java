package no.hvl.dat109;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bil",schema="Dat109")
public class Bil {

	@Id
	private String regNr;
	private String merke;
	private String Model;
	private String farge;
	private String kategori;
	private boolean ledig;
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
		return Model;
	}
	public void setModel(String model) {
		Model = model;
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
