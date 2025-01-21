package Main;
import java.util.List;
import java.util.ArrayList;

public class Project {
	private String name;
	private int duration;
	private List<Person> person;
	
	Project(){
		
	}
	
	Project(String name, int duration, List<Person> person){
		if(person.size() < 3) {
			System.out.println("Members mai noi kua 3 people");
		}
		this.name = name;
		this.duration = duration;
		this.person = person;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDuration() {
		return duration;
	}
	
	 public List<Person> getMembers() {
	    return person;
	}

	 public void setMembers(List<Person> person) {
		 if (person.size() < 3) {
	            System.out.println("Members mai noi kua 3 people");
	     }
		 this.person = person;
	}
}
