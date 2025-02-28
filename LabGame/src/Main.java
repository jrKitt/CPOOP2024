public class Main {
    public static void main(String[] args) {

        Knife knife = new Knife(3);
        GameEnv env = new GameEnv();
        env.setPlayer(100, 10, 5, knife);
        env.setMonster(100, 20, 10);
        env.monsterAttack();
        env.monsterAttack();
        env.monsterAttack();
        env.pressSpacebar();
        env.pressSpacebar();
        env.monsterAttack();
        env.monsterAttack();
        env.pressSpacebar();
        env.monsterAttack();
        env.pressSpacebar();
        env.monsterAttack();
        System.out.printf("Player's HP Remains: " + "%.2f %n", env.getPlayerHP());
        System.out.printf("Monster's HP Remains: " + "%.2f %n", env.getMonsterHP());

    }
}