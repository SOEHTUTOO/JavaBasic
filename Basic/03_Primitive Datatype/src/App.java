
/*
 * 	Interger - byte, short, int, long
 * 	Floating Point Number - float, double
 * 	Character - char
 * 	Boolean - boolean
 */
public class App {
	public static void main(String[] args) {
		
		byte bVal = -128; // 1 byte - 8bits
		short sVal = 32767; // 2 bytes - 16bits
		int iVal = 2147483647; // 4 bytes - 32bits
		long lVal = 9223372036854775807l; // 8 bytes - 64bits
		
		float fVal = 1234.56f; // 4 bytes
		double dVal = 1234.567; // 8 bytes
		
		char cVal = 'S'; // 4 bytes
		char uVal = '\u0041';
		boolean bool = true;
		
		System.out.println(bool);
		System.out.println(uVal);
		System.out.println(cVal);
		System.out.println(bVal);
		System.out.println(sVal);
		System.out.println(iVal);
		System.out.println(lVal);
		System.out.println(fVal);
		System.out.println(dVal);
		
	}
	
}
