package Lab;

public class Main {

	public static void main(String[] args) {
		
	
		Pokemon Charmander = new Pokemon("Charmander", "Fire", 3000, 300);
      
		Charmander.attack();
		Charmander.attack();
		Charmander.attack();
		Charmander.dodge();
		Charmander.health();
		
		Charmander.evolve(550, 4000);
		
		Charmander.health();
	}
	
}
