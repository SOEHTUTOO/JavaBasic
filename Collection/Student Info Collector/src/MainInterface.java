import java.io.File;

public class MainInterface {

	public static void main(String[] args) {
		
		ObjectWriter collect = new ObjectWriter();
		ObjectReader read = new ObjectReader();
		Menu menu = new Menu();
		
		System.out.println("HELLO, WELCOME YOU FROM HERE, I AM COLLECTOR FOR YOUR INFORMATION.");
		
		menu.menuStart();
		//collect.startObjectWrite();
		read.startObjectRead();
		
	}
}
