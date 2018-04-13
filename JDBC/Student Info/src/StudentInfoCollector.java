import java.util.Scanner;

public class StudentInfoCollector {
	
	private Scanner userInput;

	public void startCollectInfo() {

		Student student = new Student();
		
		userInput = new Scanner(System.in);
		
		System.out.print("\tType Your Name : ");
		student.setStudentName(userInput.nextLine());
		System.out.print("\n\tType Your Birth Date : ");
		student.setBirthDate(userInput.nextLine());
		System.out.print("\n\tType Your Birth Month : ");
		student.setBirthMonth(userInput.nextLine());
		System.out.print("\n\tType Your Birth Year : ");
		student.setBirthYear(userInput.nextLine());
		System.out.print("\n\tType Your Father Name : ");
		student.setFatherName(userInput.nextLine());
		System.out.print("\n\tType Your Mother Name : ");
		student.setMotherName(userInput.nextLine());
		System.out.print("\n\tType Your Address : ");
		student.setStudentPlace(userInput.nextLine());
		System.out.print("\n\tType Your Mobile Number : ");
		student.setStudentMobile(userInput.nextLine());
		

	}

}
