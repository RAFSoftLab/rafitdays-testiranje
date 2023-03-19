package trgovina;

import java.time.LocalDate;
import java.util.Objects;

public class Kupovina {
	
	private String naziv;
	private int kolicina;
	private LocalDate datum;	
	
	public Kupovina(String naziv, int kolicina, LocalDate datum) {
		super();
		this.naziv = naziv;
		this.kolicina = kolicina;
		this.datum = datum;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	@Override
	public int hashCode() {
		return Objects.hash(datum, kolicina, naziv);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kupovina other = (Kupovina) obj;
		return Objects.equals(datum, other.datum) && kolicina == other.kolicina && Objects.equals(naziv, other.naziv);
	}
	
	

}
