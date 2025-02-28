public class Actors {

    private double hp;
    private  double atk;
    private  double def;

    public Actors(){
        this.hp = 0;
        this.atk = 0;
        this.def = 0;
    }

    public Actors(double hp, double atk, double def){
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public double getAtk(){
        return atk;
    }

    public double getHp(){
        return hp;
    }

    public double getDef(){
        return def;
    }

    public void setHp(double hp){
        this.hp = hp;
    }

    public double attack(){
        return atk;
    }

}
