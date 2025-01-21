package introduct_test;

public class Dog {
	private String name = "Dada";
	private double weight = 20.5;
	
	public String getName() {
		return this.name;
	}
	
	public String getDogInfo() {
		String txt = String.format("Dog Name: %s, Weight: %.2f%n", this.name, this.weight);
		
		return txt;
	}
	
	public String bark() {
		return "Hong!!!!!!!";
	}
	
	public static void main(String[] args) {
		Dog D = new Dog();
		
		
		System.out.println(D.getName());
		System.out.println(D.getDogInfo());
		System.out.println(D.bark());
		
	}
}


