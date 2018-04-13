package demo2;

public class Car extends Machine {
	
	@Override
	public void start() {
		System.out.println("Car Started.");
	}
	
	public void wipeWindShield() {
		System.out.println("Wipping Wind Shield");
	}

}
