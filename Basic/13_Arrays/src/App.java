/*
 *  [] [] [] [] [] - Indexs
 */
public class App {

	public static void main(String[] args) {
		
//		int [] numbers;
//		numbers = new int[5];
		
		int [] numbers = new int [7];
		
		numbers [0] = 3;
		numbers [1] = 4;
		numbers [2] = 5;
		numbers [3] = 6;
		numbers [4] = 7;
		numbers [5] = 8;
		numbers [6] = 9;
		
//		System.out.println(numbers.length);
		
//		System.out.println(numbers[2]);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Index: "+i+", Value: "+numbers[i]);
		}
		
		String [] names = {"Su Su","Mg Mg","Hla Hla"};
		
//		System.out.println(names.length);
		
		// For each
		for(String val:names) {
			System.out.println(val);
		}
		
		
	}
}
