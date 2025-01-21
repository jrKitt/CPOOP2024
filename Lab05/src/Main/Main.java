package Main;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Person mem1 = new Person("Kittichai", "kittichai@email.com");
		Person mem2 = new Person("Sorawit", "sorawit@email.com");
		Person mem3 = new Person("Patsaphorn", "wanwan@email.com");
		
        List<Person> members = new ArrayList<>();
        members.add(mem1);
        members.add(mem2);
        members.add(mem3);
        
        Project project = new Project("Neo Armstrong Psychojet Armstrong โหเล่นของยากซะด้วย", 6, members);
        System.out.println("Project Name: " + project.getName());
        System.out.println("Project Duration: " + project.getDuration() + "m");
        System.out.println("Members:");
        for (Person member : project.getMembers()) {
            System.out.println(member.getName() + " - " + member.getEmail());
        }
 	}
}
