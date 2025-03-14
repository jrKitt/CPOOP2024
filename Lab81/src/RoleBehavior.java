/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
abstract class RoleBehavior {
    protected int earn_amt;

    public RoleBehavior(){}
    public RoleBehavior(int earn_amt) {
        this.earn_amt = earn_amt;
    }

    public abstract double cost();
    public abstract String jobDescription();
}