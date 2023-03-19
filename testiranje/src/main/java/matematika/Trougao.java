package matematika;

public class Trougao {
	
	/**
	 * Prosledjuju se duzine stranica trougla, a operacija vraca vrstu trougla:
	 * - jednakostranicni
	 * - jednakokraki
	 * - raznostrani	
	 * 
	 * Moze biti i nepravilan trougao, ako je barem jedna od stranica manja ili jednaka nuli ili je zbir neke dve stranice manji ili jednak od trece 
	 */
	
	public static String vrstaTrougla(double a, double b, double c) {
		if(a>=b+c || b>=a+c || c>=a+b || a<=0 || b<=0 || c<=0)
			return "nepravilan";
		if(a == b  && b == c)
			return "jednakostranicni";
		if(a == b  || b == c || a==c)
			return "jednakokraki";		
		return "raznostrani";
	}
}
