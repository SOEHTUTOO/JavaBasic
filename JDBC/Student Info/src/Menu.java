import java.util.Scanner;

public class Menu {
	
	private Scanner menuInput;
	
	public void startMenu() {
		
		menuInput = new Scanner(System.in);
		
		Student student = new Student();
		
		StudentDatabase stdb = new StudentDatabase();
		
		StudentInfoCollector stInfoCLR = new StudentInfoCollector();
		
		
		
		System.out.println("Welcome from Phaung Daw Oo Student Info Colletor Program!");
		System.out.println("\t\"MENU\"");
		System.out.println("\t1.\tAdd New Student\n\t2.\tSearch Student\n\t3.\tModify Your Info\n\t4.\tExit Application");
		System.out.println("\tChoose from Menu to continue ...");
		System.out.print("Type the number >> ");
		
		int userInput;
		
		while((userInput=menuInput.nextInt())!=4) {
		
		switch(userInput) {
		
		case 1:
			
			stInfoCLR.startCollectInfo();
			student.toString();
			stdb.saveStudentInfoToDB();
			
			break;
		case 2:
			System.out.println("Search Feature is still working...");
			break;
		case 3:
			System.out.println("Modify Feature is still working...");
			break;
		default:
			System.out.println("Do you know what is your typing?");
			break;
			}
		
		System.out.println("\t\"MENU\"");
		System.out.println("\t1.\tAdd New Student\n\t2.\tSearch Student\n\t3.\tModify Your Info\n\t4.\tExit Application");
		System.out.println("\tChoose from Menu to continue ...");
		System.out.print("Type the number >> ");
		
		}
		
		
		
		
		
	}

}
