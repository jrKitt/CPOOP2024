/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
public class Company {
    private int id;
    private String companyName;

    public Company(int id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Company [id=" + id + ", companyName=" + companyName + "]";
    }

}
