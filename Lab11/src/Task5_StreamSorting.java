import java.util.*;
import java.util.stream.Collectors;

public class Task5_StreamSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(3, "Bob", 65000.0),
                new Employee(6, "Sumaree", 43000.0),
                new Employee(4, "Cherry", 45000.0),
                new Employee(5, "Rose", 25000.0),
                new Employee(1, "John", 75000.0),
                new Employee(2, "Amory", 35000.0)
        );

        Map<String, List<Employee>> employ = employees.stream()
                .collect(Collectors.groupingBy(Task5_StreamSorting::assignDepartment));

        employ.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().stream()
                            .sorted(Comparator.comparing(Employee::getName))
                            .forEach(e -> System.out.println(e.getId() + "," + e.getName() + ", " + e.getSalary()));
                });
    }

    static String assignDepartment(Employee e) {
        if (e.getId() == 3 || e.getId() == 6) return "Sale";
        else if (e.getId() == 4 || e.getId() == 5) return "Accounting";
        else return "IT";
    }
}
