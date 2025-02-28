public class GameEnv {
    private Player player;
    private Monster monster;

    public GameEnv() {
        this.player = null;
        this.monster = null;
    }

    public void setPlayer(double hp, double atk, double def, Knife knife) {
        this.player = new Player(hp, atk, def, knife);
    }

    public void setMonster(double hp, double atk, double def) {
        this.monster = new Monster(hp, atk, def);
    }


    public double getPlayerHP() {
        return player.getHp();
    }

    public double getMonsterHP() {
        return monster.getHp();
    }

    public void pressSpacebar() {
        if (!monster.dodge()) {
            playerAttack();
        } else {
            System.out.println("Monster dodge.");
        }
    }

    public void monsterAttack() {
        double damage = getDamage(monster, player);
        player.setHp(player.getHp() - damage);
        System.out.println("Monster attack " + damage + " dmg.");
    }

    public void playerAttack() {
        double damage = getDamage(player, monster);
        monster.setHp(monster.getHp() - damage);
        System.out.println("Player attack " + damage + " dmg.");
    }

    public double getDamage(Player player, Monster monster) {
        return player.attack() * (1 / monster.getDef());
    }

    public double getDamage(Monster monster, Player player) {
        return monster.attack() * (1 / player.getDef());
    }

}
