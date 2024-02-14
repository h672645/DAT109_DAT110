package no.hvl.dat109;



public abstract class Kategori {
	

	public double getPris(String kategri) {
		 double pris=0;
	
		 if(kategri.equals("SEDAN")){
			 pris= 100;
		 }
	   
		 if(kategri.equals("SPORT")){
			 pris= 150;
		 }
		 if(kategri.equals("suv")){
			 pris= 300;
		 }
	   
		 
		 return pris;

	}}
