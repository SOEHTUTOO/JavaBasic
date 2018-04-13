import java.util.Scanner;
public class CafeMain {
	
	private static Scanner userinput;
	
	private static final int FOOD_MENU = 1;
	private static final int DRINK_MENU = 2;
	private static final int CHECK_BALANCE = 3;
	
	public void startApp() {
		
		userinput = new Scanner(System.in);
		
		System.out.println("*********************\nWELCOME TO CAFE JAVA\n*********************");
		System.out.println("Choose Services\n \t1. Food\n \t2. Drink\n \t3. Balance\n \t0. Exit");
		System.out.print("Type the number for your choose here >> ");
		
		Balance balance = new Balance();
		int inputnumber;
		
		while((inputnumber = userinput.nextInt()) != 0) {
			switch(inputnumber) {
			case FOOD_MENU:
			case DRINK_MENU:
				Menu menu = creatMenu(inputnumber);
				menu.show();
				break;
			case CHECK_BALANCE:
				System.out.println("Your Total Balance : "+balance.getTotal()+"Ks.");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			showMenu();
		}
		System.out.println("Thank You!");
		
	}

	private void showMenu() {
		System.out.println("Choose Services\n \t1. Food\n \t2. Drink\n \t3. Balance\n \t0. Exit");
		System.out.print("Type the number for your choose here >> ");
	}
	
	public Menu creatMenu(int userType) {
		
		Menu menu = null;
		
		switch(userType) {
		case FOOD_MENU:
			menu = new FoodMenu();
		break;
		case DRINK_MENU:
			menu = new DrinkMenu();
		break;
		}
		
		return menu;
		
	}
	
	
	
}
