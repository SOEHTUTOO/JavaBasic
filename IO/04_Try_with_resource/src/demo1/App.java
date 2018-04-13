package demo1;

class Test implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closed");
		}
}

public class App {

	public static void main(String[] args) {
		
		try(Test t = new Test()) {
			
		} catch(Exception e) {
			
		}
	}
	
}
