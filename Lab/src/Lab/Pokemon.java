package Lab;

public class Pokemon {
	
	String name = " ";
	String type = " ";
	int power = 0;
	int health = 0;
	
	public Pokemon (String name, String type, int health, int power ) {
		this.name = name;
		this.type = type;
		this.health = health;
		this.power = power;
	}
	
	void attack() {
		this.health = this.health - this.power;
		System.out.println(this.name + " Decrese by " + this.power);
	}
	
	void dodge() {
		System.out.println(this.name + " >.<");
	}
	
	void health() {
		System.out.println(this.name + " has HP " + this.health);
	}

	void evolve(int power, int health) {
		this.power = power;
		this.health = health;
	}

	
}
