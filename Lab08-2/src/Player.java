/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
public class Player {
    private int id;
    private String name;
    private IRoleBehavior role;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.role = null;
    }

    public void setRole(IRoleBehavior role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public IRoleBehavior getRole() {
        return role;
    }

    public String getPlayerInfo() {
        return id + "\t\t " + name + "\t\t" + role.jobDescription() + "\t\t" + role.cost();
    }
}
