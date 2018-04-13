import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectWriter{
	
	public static Scanner input;
	
	public void startObjectWrite() {
	
	File studentFile = new File("D:\\WorkSpace\\Collection\\Student Info Collector\\src\\files\\Student.bin");
	
	input = new Scanner(System.in);
	
	Student student = new Student();
	
	System.out.print("Type Your Name >> ");
	student.setName(input.nextLine());
	
	System.out.print("Type Your Age >> ");
	student.setAge(input.nextLine());
	
	System.out.print("Type Your Birth Date >> ");
	student.setBirthDate(input.nextLine());
	
	System.out.print("Type Your ID >> ");
	student.setId(input.nextLine());
	
	System.out.print("Type Your Father Name >> ");
	student.setFather(input.nextLine());
	
	System.out.print("Type Your Mother Name >> ");
	student.setMother(input.nextLine());
	
	System.out.print("Type Your Phone Number >> ");
	student.setPhone(input.nextLine());
	
	System.out.print("Type Your Place >> ");
	student.setPlace(input.nextLine());
	
	try (ObjectOutputStream studentInfoWriter = new ObjectOutputStream(new FileOutputStream(studentFile))){
		
		studentInfoWriter.writeObject(student);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

}
}
