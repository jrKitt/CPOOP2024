/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
class Player {
    private int id;
    private String name;
    RoleBehavior role;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.role = null;
    }

    public void setRole(RoleBehavior role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public RoleBehavior getRole() {
        return role;
    }

    public String getPlayerInfo() {
        return id + "\t\t " + name + "\t\t" + role.jobDescription() + "\t\t" + role.cost();
    }
}