public class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(){}
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", Salary=" + salary + "]";
    }
}

