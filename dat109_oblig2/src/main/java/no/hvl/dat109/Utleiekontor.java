package no.hvl.dat109;


import java.util.ArrayList;
import java.util.List;

public class Utleiekontor {
    private String navn;
    private String sted;
    private List<Bil> tilgjengeligeBiler;

    public Utleiekontor(String navn, String sted) {
        this.navn = navn;
        this.sted = sted;
        this.tilgjengeligeBiler = new ArrayList<>();
    }


    
    // Legg til en bil i utleiekontoret
    public void leggTilBil(Bil bil) {
        tilgjengeligeBiler.add(bil);
    }

    // Fjern en bil fra utleiekontoret
    public void fjernBil(Bil bil) {
        tilgjengeligeBiler.remove(bil);
    }

    // Hent alle tilgjengelige biler i utleiekontoret
    public List<Bil> hentTilgjengeligeBiler() {
        return tilgjengeligeBiler;
    }

    // Annen funksjonalitet og metoder etter behov
}
