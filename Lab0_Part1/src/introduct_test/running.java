package introduct_test;

public class running {
	private static int nextNo = 0;
	public void increasingNumber(){
		running.nextNo++; 
	}
	public int getNextNo(){
		return nextNo; 
	}
	
	
	public static void main (String[] args) {
		running run1 = new running();
		running run2 = new running();
		run1.increasingNumber();
		int no1_1 = run1.getNextNo();
		run2.increasingNumber();
		int no2_1 = run2.getNextNo();
		int no1_2 = run1.getNextNo();
		
		System.out.println(no1_1);
		System.out.println(no1_2);
		System.out.println(no1_2);

	}
}
