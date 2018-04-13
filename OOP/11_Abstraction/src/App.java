
public class App {
	 public static void main(String[] args) {
		
		 Machine car = new Car();
		 Machine bike = new MotorBike();
		 
		 Workshop workshop = new Workshop();
		 
		 workshop.test(car);
		 workshop.test(bike);
	}
}
