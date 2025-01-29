import java.util.ArrayList;
import java.util.List;
class Company {
    private String name;
    private String tel;
    private List<Employee> add;

    public Company(String name, String tel) {
        this.name = name;
        this.tel = tel;
        this.add = new ArrayList<>();
    }

    public void add(Employee employee) {
        add.add(employee);
    }

    public void showAllEmployee() {
        System.out.println("Id\tName\tSalary\tWork (Job description)");
        for (Employee e : add) {
            String txt = e.id + "\t" + e.name + "\t" + e.salary + "\t" + e.work();
            System.out.println(txt);
        }
    }
}