/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
class Player {
    private int id;
    private String name;
    private RoleBehavior role;

    public Player(int id, String name, RoleBehavior role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public String getPlayerInfo() {
        return id + "\t\t " + name + "\t\t" + role.jobDescription() + "\t\t" + role.cost();
    }
}