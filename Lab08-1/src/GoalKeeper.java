/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
class GoalKeeper extends RoleBehavior {
    @Override
    public double cost() {
        return 4500;
    }

    @Override
    public String jobDescription() {
        return "Goalkeeper";
    }
}
