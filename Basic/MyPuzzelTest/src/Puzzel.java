
public class Puzzel {

	public static void main(String[] args) {
		
		int A = 1;
		int B = 2;
		int C = 4;
		int D = 8;
		int E = 16;
		
		
		int [] cardNumber = new int [31];
		
		for(int n = 0; n<=30; n++) {
			cardNumber [n] = n+=1;
		}
		
		
		
		System.out.println("Card A numbers are ");
		System.out.println("-----------------------------------------------");
		
		for(int cardA = 0; cardA < cardNumber.length; cardA+=2) {
		if(cardNumber[cardA]%2==0);{
			System.out.print(cardNumber[cardA]+" ");
		}
		}
		
		System.out.println("\n-----------------------------------------------");
		
		System.out.println("Card E numbers are ");
		System.out.println("-----------------------------------------------");
		
		for(int cardE = 16; cardE <= 31; cardE++) {
			System.out.print(cardE+" ");
		}
		
		System.out.println("\n-----------------------------------------------");
		
		
		
	}
}
