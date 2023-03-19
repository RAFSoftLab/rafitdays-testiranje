package trgovina;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Kupac {
	
	private List<Kupovina> sveKupovine = new ArrayList<Kupovina>();
	
	public boolean kupi(Prodavnica prodavnica, String proizvod, int kolicina) {
		if(prodavnica.kupi(proizvod, kolicina)) {
			sveKupovine.add(new Kupovina(proizvod, kolicina, LocalDate.now()));
			return true;
		}
		return false;
	}
	
	public Kupovina getPoslednjaKupovina() {
		if(sveKupovine.size()==0) return null;
		return sveKupovine.get(sveKupovine.size()-1);
	}
	
	public int getBrojKupovina() {
		return sveKupovine.size();
	}
	
	public boolean mozeDaSeKupi(Prodavnica prodavnica, String proizvod, int kolicina) {
		if(prodavnica.getKolicina(proizvod)>=kolicina)
			return true;
		return false;
	}
	

}
