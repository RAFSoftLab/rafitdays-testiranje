package trgovina;

import java.util.HashMap;
import java.util.Map;

public class Prodavnica{

	private Map<String,Integer> inventar = new HashMap<String, Integer>();
	
	
	public void dodajProizvod(String nazivProizvoda, int kolicina) {
		if(inventar.containsKey(nazivProizvoda))
			inventar.put(nazivProizvoda, inventar.get(nazivProizvoda)+kolicina);
		else
			inventar.put(nazivProizvoda, kolicina);
	}
	
	public boolean kupi(String nazivProizvoda, int kolicina) {
		if(!inventar.containsKey(nazivProizvoda)) {
			return false;
		}else if(inventar.get(nazivProizvoda)>=kolicina) {
			inventar.put(nazivProizvoda, inventar.get(nazivProizvoda)-kolicina);
			return true;			
		}else {
			return false;
		}
	}
	
	public int getKolicina(String naziv) {
		if(inventar.containsKey(naziv))
			return inventar.get(naziv);
		return 0;
	}
	
}
