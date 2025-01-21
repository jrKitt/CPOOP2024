package Lab04;

public class Mainbook {
	public static void main(String[] args) {
		Book[] book = new Book[4];
		book[0] = new Book("AI for All", 560);
		book[1] = new Book("Easy ML", 330);
		book[2] = new Book("Funny Calculus", 199);
		book[3] = new Book("SQL 101", 290);
		
		for(Book b: book) {
            System.out.println("Name: " + b.getName() + " - Price: " + b.getPrice());
		}
		
		int total = totalBookPrice(book);
	    System.out.println("Total Price: " + total);
	
	}
	public static int totalBookPrice(Book[] books) {
	        int sum = 0;
	        for (Book b : books) {
	            sum += b.getPrice();
	        }
	        return sum;
	}
}
