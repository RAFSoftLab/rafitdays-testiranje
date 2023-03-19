package trougaooop;

public class Trougao {
	
	// duzine stranice trougla 	
	private double a,b,c;
	
	public Trougao(double a, double b, double c) {
		if(a<=0 || b<=0 || c<=0)
			throw new NevalidanTrougaoException(a,b,c);
		if(a>=b+c || b>=a+c || c>=a+b)
			throw new NevalidanTrougaoException(a,b,c);		
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/*
	Ne stavljamo set metode jer stranice trougla ne mogu naknadno da se menjaju
	 */
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public boolean isJednakostranicni(){
		return this.a == this.b  && this.b == this.c;
	}

	public boolean isJednakokraki(){
		return !isJednakostranicni() && (this.a == this.b || this.b == this.c || this.a==this.c);
	}

	public boolean isRaznostrani(){
		return this.a!=this.b && this.a!=this.c && this.b!=this.c;
	}

	public VrstaTrougla getVrsta(){
		if (isJednakostranicni()) return VrstaTrougla.JEDNAKOSTRANICNI;
		if (isJednakokraki()) return VrstaTrougla.JEDNAKOKRAKI;
		return VrstaTrougla.RAZNOSTRANI;
	}
	
	
	
	

	
	
	
}
