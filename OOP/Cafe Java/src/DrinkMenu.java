import java.util.Scanner;
public class DrinkMenu extends Menu{
	
	Scanner userinput = new Scanner(System.in);
	Balance totalBalance = new Balance();
	
	@Override
	public void show() {
		System.out.println("Choose Drinks\n \t1. Juice - 800\n \t2. Coffee - 500\n \t0. Back to Menu");
		System.out.print("Type to choose the number for here >> ");
		
		int inputnumber;
		
		while((inputnumber = userinput.nextInt()) != 0) {
			switch(inputnumber) {
			case 1:
				System.out.print("How much Juice do you want?\nType the number of Juice you want >> ");
				totalBalance.add(userinput.nextInt() * 800);
				break;
			case 2:
				System.out.print("How much Coffee do you want?\nType the number of Coffee you want >> ");
				totalBalance.add(userinput.nextInt() * 500);
				break;
			default:
				System.out.print("Invalid Input");
				break;
			}
			System.out.println("Choose Drinks\n \t1. Juice\n \t2. Coffee\n \t0. Back to Menu");
			System.out.print("Type to choose the number for here >> ");
		}
		
		
	}

}
