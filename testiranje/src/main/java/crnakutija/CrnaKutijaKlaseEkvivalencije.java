package crnakutija;

import java.time.LocalDate;
import java.time.Period;


public class CrnaKutijaKlaseEkvivalencije {
	
	/**
	 * Proverava da li je ocena validna, validne ocene su u intrevalu [5,10] 
	 * @param ocena
	 * @return
	 */
	
	public static boolean validnaOcena(int ocena) {
		if(ocena>=5 && ocena <=10)
			return true;
		else 
			return false;
		
	} 
	
	
	/**
	 * Na osnovu datuma rodjenja vraca da li je osoba rodjena tog datuma punoletna
	 * @param v
	 * @return
	 */
	public static boolean jePunoletan(LocalDate datumRodjenja) {
		LocalDate danasnji = LocalDate.now();
		int godine  = Period.between(datumRodjenja, danasnji).getYears();		
		if(godine>=18)
			return true;
		else
			return false;
		
	}
	
	
	/**
	 * Na osnovu datuma rodjenja vraca da li je osoba rodjena tog datuma punoletna 
	 * za nevalidne ulaze se ispaljuje izuzetak
	 * @param v
	 * @return
	 */
	public static boolean jePunoletanKompletno(LocalDate datumRodjenja) throws NevalidanDatumRodjenjaIzuzetak {
		if(datumRodjenja==null)
			throw new NevalidanDatumRodjenjaIzuzetak("Datum rodjena ne moze biti null");		
		LocalDate danasnji = LocalDate.now();
		if(datumRodjenja.isAfter(danasnji))
			throw new NevalidanDatumRodjenjaIzuzetak("Datum rodjena ne moze biti posle danasnjeg datuma");
		int godine  = Period.between(datumRodjenja, danasnji).getYears();		
		if(godine>=18)
			return true;
		else
			return false; 
		
	}
	
	
	
	
	public static void main(String args[]) {
		
		jePunoletan(LocalDate.of(2024, 11, 13));
		
	}
}
