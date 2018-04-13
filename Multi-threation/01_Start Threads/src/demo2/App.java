package demo2;
class Runner implements Runnable{
	
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
		
		Runnable run1 = new Runner();
		Thread t1 = new Thread(run1);
		t1.start();
		
//		Thread t1 = new Thread(new Runner());
//		t1.start();
		
		Runnable run2 = new Runner();
		Thread t2 = new Thread(run2);
		t2.start();
		
		
		
		
		
		System.out.println("Hi");
		
	}
	
}
