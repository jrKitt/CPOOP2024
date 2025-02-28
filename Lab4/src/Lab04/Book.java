package Lab04;

public class Book {
	private String name;
	private int price;
	
	Book() {
		this.name = "";
		this.price = 0;
	}
	Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		this.name = name;
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int setPrice(int price) {
		this.price = price;
		return price;
	}
	
}
