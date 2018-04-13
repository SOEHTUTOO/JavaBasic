

public class App {

	public static void main(String[] args) {
		int x = 19;
		int y = 99;
		int z = 113;
		
		if(x>y && x>z) {
			System.out.println("X is the largest Number!");
		}else if(y>x && y>z){
			System.out.println("Y is the largest Number!");
		}else {
			System.out.println("Z is the largest Number!");
		}
		
		
		if(x<y && x<z) {
			System.out.println("X = "+x);
		}else if(y<x && y<z) {
			System.out.println("Y = "+y);
		}else if(z<x && z<y) {
			System.out.println("Z = "+z);
		}
		
		if(x<y && x>z) {
			System.out.println("X = "+x);
		}else if(x>y && x<z) {
			System.out.println("X = "+x);
		}else if(y<x && y>z) {
			System.out.println("Y = "+y);
		}else if(y>x && y<z) {
			System.out.println("Y = "+y);
		}else if(z<x && z>y) {
			System.out.println("Z = "+z);
		}else if(z>x && z<y) {
			System.out.println("Z = "+z);
		}
		
		if(x>y && x>z) {
			System.out.println("X = "+x);
		}else if(y>x && y>z) {
			System.out.println("Y = "+y);
		}else if(z>x && z>y) {
			System.out.println("Z = "+z);
		}
		
		int a = 7;
		int b = 12;
		int c = a;
		
		a = b;
		b = c;
		
		System.out.println(a+" "+b);
		
		
		
	}
}		
		
