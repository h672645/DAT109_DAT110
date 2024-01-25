package no.hvl.dat108.webshop;
/**Brett klasse */
import java.util.ArrayList;
import java.util.List;



public class Spillebrett {

	private List<Rute> ruteliste; // her oppretter man en liste av type 'Rute'
	

	//konstruktør som vil opprette ny objekt 'brett'.
	public Spillebrett(){
		ruteliste= new ArrayList<Rute>();
		leggTilRute();
}
	
	
	 //**** legg til rutene,stiger og slanger    *****/ 
	public void leggTilRute(){

		ruteliste= new ArrayList<Rute> ();

		for(int i=0; i<=99; i++){
			ruteliste.add(new Rute(i));
		}	
				//***Slanger */
				//ruteNr	//er berre random verdier'nummer' tenke å diskutere her.			
			ruteliste.get(88).getSlange().setLengde(77);
			ruteliste.get(35).getSlange().setLengde(50);
			ruteliste.get(22).getSlange().setLengde(44);
			ruteliste.get(14).getSlange().setLengde(80);

		// Stigene
			ruteliste.get(5).getStiger().setLengde(23);
			ruteliste.get(35).getStiger().setLengde(77);
			ruteliste.get(10).getStiger().setLengde(26);
			ruteliste.get(66).getStiger().setLengde(99);
		}

		public List<Rute> getRute(){
			return ruteliste;
		}

		/**
		 * metode finner den ny brikke som skal flyttes til..
		 * rute er hvor spilleren står..
		 * verdi er verdien av terning,antall ruter som brikken skal flyttes.
		 * return ny ruten.
		 */
		
		 public Rute soekRute(Rute rute, Integer verdien){

			//usikker på loggikken her det kan sikkert bedre å diskutere!!
			int ruteVerdi=rute.getRutenummer()+verdien ;
				Rute nyRute=ruteliste.get(ruteVerdi);
					if (nyRute.getSlange().getLengde()>0){

					nyRute=ruteliste.get(ruteVerdi - ruteliste.get(ruteVerdi).getSlange().getLengde());
						System.out.println(" *** Du har landet på en slange ** !!");

					} else {
				System.out.println("**** Du har landet på en Stige ****!!!");
			}
				return nyRute;
		 }

	}//klasse
	
	

