import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Task4_StreamMethodReference {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(3, "Bob", 65000.0),
                new Employee(6, "Sumaree", 43000.0),
                new Employee(4, "Cherry", 45000.0),
                new Employee(5, "Rose", 25000.0),
                new Employee(1, "John", 75000.0),
                new Employee(2, "Amory", 35000.0)
        );

        Map<String, List<Employee>> task4 = employees.stream()
                .collect(Collectors.groupingBy(Task4_StreamMethodReference::assignDepartment));

        task4.forEach((department, empList) -> {
            System.out.println(department);
            empList.forEach(System.out::println);
        });
    }

    public static String assignDepartment(Employee e) {
        if (e.getId() == 3 || e.getId() == 6) return "Sale";
        else if (e.getId() == 4 || e.getId() == 5) return "Accounting";
        else return "IT";
    }
}