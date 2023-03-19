package trougaooop;

public class NevalidanTrougaoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NevalidanTrougaoException(double a, double b, double c) {		
		super(String.format("Stranice %f, %f, %f ne cine validan trougao", a, b, c));
		
	}
	
	
	

}
