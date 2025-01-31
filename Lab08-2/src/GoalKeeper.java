/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
public class GoalKeeper implements IRoleBehavior {
    String role;

    public Forward(int earn_amt, String role) {
        super(earn_amt);
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