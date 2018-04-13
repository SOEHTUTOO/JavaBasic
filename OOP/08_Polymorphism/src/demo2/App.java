package demo2;

// Method Override

public class App {
	public static void main(String[] args) {
		
		Machine mac1 = new Machine();
		mac1.start();
		
		Car car1 = new Car();
		car1.start();
		car1.wipeWindShield();
		
		Machine mac2 = car1;
		mac2.start();
		//mac2.wipeWindShield();
	}
}
