import java.util.Scanner;
public class FoodMenu extends Menu{
	
	Scanner userinput = new Scanner(System.in);
	Balance totalBalance = new Balance();
	
	@Override
	public void show() {
		System.out.println("Choose Foods\n \t1. Burger - 1000\n \t2. Pizza - 1500\n \t3. Butter Cake - 700\n \t0. Back to Menu");
		System.out.print("Type to choose the number for here >> ");
		
		int inputnumber;
		
		while((inputnumber = userinput.nextInt()) != 0) {
			switch(inputnumber) {
			case 1:
				System.out.print("How much Burger do you want?\nType the number of Burger you want >> ");
				totalBalance.add(userinput.nextInt() * 1000);
				break;
			case 2:
				System.out.print("How much Pizza do you want?\nType the number of Pizza you want >> ");
				totalBalance.add(userinput.nextInt() * 1500);
				break;
			case 3:
				System.out.print("How much Butter Cake do you want?\nType the number of Butter Cake you want >> ");
				totalBalance.add(userinput.nextInt() * 700);
				break;
			default:
				System.out.print("Invalid Input");
				break;
			}
			System.out.println("Choose Foods\n \t1. Burger\n \t2. Pizza\n \t3. Butter Cake\n \t0. Back to Menu");
			System.out.print("Type to choose the number for here >> ");
		}
	}
}
