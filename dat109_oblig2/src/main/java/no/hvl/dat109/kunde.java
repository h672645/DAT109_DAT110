package no.hvl.dat109;

public class kunde {
    private String fornavn;
    private String etternavn;
    private String addressa;
    private String telefonnummer;
    private String  kreditkortnr;


    public kunde(){

    }
    public kunde(String fornavn, String etternavn, String addressa, String telefonnummer, String kreditkortnr) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.addressa = addressa;
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
        return addressa;
    }
    public void setAddressa(String addressa) {
        this.addressa = addressa;
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
