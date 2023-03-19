package crnakutija;

import java.time.LocalDate;

public class NevalidanDatumRodjenjaIzuzetak extends RuntimeException {

	public NevalidanDatumRodjenjaIzuzetak(String poruka) {
		super(poruka);
	}
	
	

}
