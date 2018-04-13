import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {

	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Mg Mg");
		Person p2 = new Person(2, "Su Su");
		Person p3 = new Person(3, "Ko Ko");
		
		File file = new File("D:\\object.bin");
		
		Person [] people = { p1 , p2 , p3 };
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			
			oos.writeObject(people);
			
			System.out.println("Finish.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		 
		
	}
}
