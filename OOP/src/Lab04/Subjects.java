package Lab04;

public class Subjects {
	private String name;
	private int credit;
	
	Subjects(){
		this.name = "";
		this.credit = 0;
	}
	
	Subjects(String name, int credit){
		this.name = name;
		this.credit = credit; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCredit() {
		return credit;
	}
	
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
	
}
