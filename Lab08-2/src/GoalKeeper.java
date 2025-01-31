/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
public class GoalKeeper implements IRoleBehavior {
    protected double earn_amt;
    String role;

    public GoalKeeper(double earn_amt, String role) {
        this.earn_amt = earn_amt;
        this.role = role;
    }

    @Override
    public double cost() {
        return earn_amt;
    }

    @Override
    public String jobDescription() {
        return role;
    }
}