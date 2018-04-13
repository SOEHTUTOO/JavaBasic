package demo1;
class Runner extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+"Hello");
			
		}
		
	}
	
}


public class App {

	public static void main(String[] args) {
		
		Runner runner1 = new Runner();
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();
		
		System.out.println("Hi");
		
	}
	
}
