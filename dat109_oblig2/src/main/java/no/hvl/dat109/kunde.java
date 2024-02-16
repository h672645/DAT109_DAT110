package no.hvl.dat109;

public class Kunde {
    private String fornavn;
    private String etternavn;
    private String adressa;
    private String telefonnummer;
    private String  kreditkortnr;


    public Kunde(){

    }

    

    public Kunde(String fornavn, String etternavn, String adressa, String telefonnummer, String kreditkortnr) {

        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adressa = adressa;
        this.telefonnummer = telefonnummer;
        this.kreditkortnr = kreditkortnr;
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
    public String getAddressa() {
        return adressa;
    }
    public void setAddressa(String adressa) {
        this.adressa = adressa;
    }
    public String getTelefonnummer() {
        return telefonnummer;
    }
    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
    public String getKreditkortnr() {
        return kreditkortnr;
    }
    public void setKreditkortnr(String kreditkortnr) {
        this.kreditkortnr = kreditkortnr;
    }
    
}
