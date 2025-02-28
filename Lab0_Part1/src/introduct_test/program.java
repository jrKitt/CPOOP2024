package introduct_test;
import java.util.Scanner;

public class program {
	public static int sumArray(int[] number) {
		int sum = 0;
		for(int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		int[] nArr = {2,5,19,7,10,35};
		System.out.println("Sum Array : " + sumArray(nArr) );
		
	}


}
