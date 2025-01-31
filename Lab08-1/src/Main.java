/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
public class Main {
    public static void main(String[] args) {
        Team team = new Team("Khon Kaen United", "Khon Kaen");

        team.add(new Player(01, "Joey", new GoalKeeper()));
        team.add(new Player(2, "Tony", new CenterBack()));

        team.showPlayerInfo();
    }
}