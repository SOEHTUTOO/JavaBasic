
public class Product {

	private String id = null;
	private String name = null;
	private int price = 0;
	
	public Product() {
		
	}
	
	public Product(String id, String name, int price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	
	
	
}
