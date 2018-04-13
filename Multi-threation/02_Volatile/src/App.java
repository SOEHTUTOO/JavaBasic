import java.util.Scanner;

class Runner extends Thread{
	
	private volatile Boolean isRunning = true;
	
	@Override
	public void run() {
		
		while(isRunning) {
		System.out.println("Hello");
		}
	}
	
	public void stopRunning() {
		
		isRunning = false;
		
	}
	
}


public class App {

	public static void main(String[] args) {
		
		Runner runner = new Runner();
		runner.start();
		
		new Scanner(System.in).nextLine();
		
		runner.stopRunning();
		
	}

}
