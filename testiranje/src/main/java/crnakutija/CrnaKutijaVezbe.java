package crnakutija;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class CrnaKutijaVezbe {
	
	
	
	/**
	 * Na osnovu zarade obračunava se porez, prema sledećim pravilima
	 * 
	 * Do 4000 se ne plaća porez
	 * Za sledećih 1500 se plaća porez u iznosu od 10%
	 * Za sledećih 28000 plaća se porez od 22%
	 * Za sve preko toga plaća se porez 40% 
	 * 
	 * 
	 */
	
	public static double obracunajPorez(double mesecnaZarada) {
		if(mesecnaZarada<=4000)
			return 0.0;
		else if(mesecnaZarada-4000<=1500)
			return (mesecnaZarada-4000)*10/100;
		else if(mesecnaZarada-4000-1500<=28000)
			return (1500*10/100) + (mesecnaZarada-4000-1500)*22/100;
		else
			return (1500*10/100) + 28000*22/100 + (mesecnaZarada-4000-1500-28000)*40/100;
	}
	
	/**
	 * Proverava da li je indeks u validnom zapisu
	 * Validan zapis indeksa je broj-godina-stud. program
	 * Gde godina moze biti broj od 2003 do 2022
	 * Stud.program može biti malim ili velikim slovima zapisano nešto od sledećeg: RN, RI, MD i S
	 * 
	 * program ima gresaka, na osnovu testova ispraviti
	 * 
	 * @param indeks
	 * @return
	 */
	
	
	public static boolean validanZapisIndeksa(String indeks) {
		if(indeks==null) return false;
		String[] parts = indeks.split("-");
		if(parts.length!=3) return false;
		if(!jeBroj(parts[0]) || !jeBroj(parts[1])) 
			return false;
		int godina = Integer.parseInt(parts[1]);
		if(godina<2003 || godina>=2022)
			return false;			
		if(!List.of("RN","RI","MD","S").contains(parts[2]))
			return false;
		return true;		
	}
	
	
	
	
	private static boolean jeBroj(String broj) {
		try {
			Integer.parseInt(broj.trim());
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	
	
	
	
}
