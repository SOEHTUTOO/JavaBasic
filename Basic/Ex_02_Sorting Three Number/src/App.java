
public class App {

	public static void main(String[] args) {
		
		int a = 14;
		int b = 34;
		int c = 12;
		int d = 33;
		
		if (a>b) {
			int tmp = a; 
			a = b; 
			b = tmp;
		}
		if (b>c) {
			int tmp = b;
			b = c;
			c = tmp;
		}
		if (c>d) {
			int tmp = c;
			c = d;
			d = tmp;
		}
		if (a>b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		if (b>c) {
			int tmp = b;
			b = c;
			c = tmp;
		}
		if (a>b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
