package Lab;

public class Calculator {

	double num1;
	double num2;
	String operator;
	
	public Calculator(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public double add() {
		return num1 + num2;
	}
	
	public double sub() {
		return num1 - num2;
	}
	
	public double mul() {
		return num1 * num2;
	}
	
	public static void wellcome() {
        System.out.println("WELLCOM >0<");
	}
	
	
}
