package no.hvl.dat109;

import java.util.Date;

public class Reservasjon {

	private String fornavn;
	private String etternavn;
	private String adresse;
	private int telefonnummer;
	private String leiedato;
	private String kategori;
	private int kredittkortnummer;
	private Date returnertdato;
	
	public Reservasjon() {
		
	}

	
	
	public Reservasjon(String fornavn, String etternavn, String adresse, int telefonnummer, String leiedato,
			String kategori, int kredittkortnummer) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
		this.leiedato = leiedato;
		this.kategori = kategori;
	}



	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public String getLeiedato() {
		return leiedato;
	}

	public void setLeiedato(String leiedato) {
		this.leiedato = leiedato;
	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}

	public int getKredittkortnummer() {
		return kredittkortnummer;
	}

	public void setKredittkortnummer(int kredittkortnummer) {
		this.kredittkortnummer = kredittkortnummer;
	}

	public Date getReturnertdato() {
		return returnertdato;
	}

	public void setReturnertdato(Date returnertdato) {
		this.returnertdato = returnertdato;
	}
	
	
	
}
