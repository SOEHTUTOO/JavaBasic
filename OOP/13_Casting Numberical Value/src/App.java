
public class App {
/*
 *  byte, short, int, long
 *  float, double
 */
	
	public static void main(String[] args) {
		
		int x = 130;
		
		byte b = (byte) x;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(b);
		
		long lval = x;
		
		int y;
		
		float fVal = 345.67f;
		y= (int)fVal;
		
		System.out.println("Y "+y);
		
		double dVal = x;
		
		System.out.println(dVal);
	}
}
