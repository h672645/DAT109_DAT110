package no.hvl.dat109;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bil {

	@Id
	private String regNr;
	private String merke;
	private String Model;
	private String farge;
	private String kategori;
	private boolean ledig;
	
	
}
