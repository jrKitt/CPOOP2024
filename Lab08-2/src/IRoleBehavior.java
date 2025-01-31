/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
public interface IRoleBehavior {
    protected int earn_amt;
    IRoleBehavior(){}
    IRoleBehavior(int earn_amt){
        this.earn_amt = earn_amt;
    }
    double cost();
    String jobDescription();
}
