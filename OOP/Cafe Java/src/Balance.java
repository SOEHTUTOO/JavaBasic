
public class Balance {

	private static int total = 0;
	
	public void add(int amount) {
		total += amount;
	}
	
	public int getTotal() {
		return total;
	}
}
