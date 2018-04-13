
public class App {

		public static void main(String[] args) {
			
			Car car1 = new Car();
			car1.id = 23;
			car1.show(); // from Car class bcoz of Override
			car1.wipeWindShield(); // from Car class
		}
}
