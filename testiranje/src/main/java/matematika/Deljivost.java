package matematika;

public class Deljivost {
	
	/**
	 * operacija vraca najveci zajednicki delilac dva broja a i b, razlicita od nula
	 */
	
	public static int nzd(int a, int b) {
		if(a==0 || b==0)
			return 0;			
		while(b != 0){  
			if(a > b){  
				a = a - b;  
			}else{  
				b = b - a;  
			}  
		}  
		return a;  
	}
	
	
	
	
		
	

}
