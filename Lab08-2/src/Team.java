/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
import java.util.ArrayList;
import java.util.List;

class Team {
    private String name;
    private String address;
    List<Player> players = new ArrayList<>();

    public Team(String name, String address) {
        this.name = name;
        this.address = address;
        this.players = new ArrayList<>();
    }

    public void addMember(Player player) {
        players.add(player);
    }

    public void showPlayerInfo() {
        System.out.println("Team Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("\nPlayers Information");
        System.out.println("------------------------------------------------------------");
        System.out.println("No. \t ID \t Name \t\tRole \t\t\tCost");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < players.size(); i++) {
            System.out.print(i + 1 + "\t\t ");
            System.out.println(players.get(i).getPlayerInfo());
        }

        System.out.println("------------------------------------------------------------");
    }
}
