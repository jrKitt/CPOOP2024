package Lab;

public class Student {
	String name;
	double gpa;
	
	Student() {
		this.name = "_";
		this.gpa = 0.00;
	}
	
	Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	void setName(String name) {
		this.name = name;
	}
	
	String getName(){
		return this.name;
	}
	
	double getGpa(){
		return this.gpa;
	}
	
	void setGpa(double gpa){
		this.gpa = gpa;
	}

	
}