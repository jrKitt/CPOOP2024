public class Main {
    public static void main(String[] args) {
        Company company = new Company("CPOOPTECT", "099-999-9999");

        company.add(new Manager(1, "Kittichai", 12000));
        company.add(new Developer(2, "Piyada", 9000));
        company.add(new Tester(3, "WanWan", 22000));

        company.showAllEmployee();
    }
}