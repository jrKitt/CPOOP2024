import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        /*
        * [task-1]
        * ผลลัพธ์ที่ใช้ HashMap วิธีสร้างแบบปกติที่ยังไม่ได้ใช้ streams
        */
        System.out.println("HashMap");
        HashMap<String, List<Employee>> task1 = new HashMap<>();
        task1.put("Sale", Arrays.asList(
                new Employee(3, "Bob", 65000.0),
                new Employee(6, "Sumaree", 43000.0)
        ));
        task1.put("Accounting", Arrays.asList(
                new Employee(4, "Cherry", 45000.0),
                new Employee(5, "Rose", 25000.0)
        ));
        task1.put("IT", Arrays.asList(
                new Employee(1, "John", 75000.0),
                new Employee(2, "Amory", 35000.0)
        ));
        task1.forEach((department, employees) -> {
            System.out.println(department);
            employees.forEach(System.out::println);
        });

        /*
         [task-2]
         ผลลัพธ์ที่ใช้ TreeMap วิธีสร้างแบบปกติที่ยังไม่ได้ใช้ streams
         */

        System.out.println("\nTreeMap");
        TreeMap<String, List<Employee>> task2 = new TreeMap<>();

        task2.put("Sale", Arrays.asList(
                new Employee(3, "Bob", 65000.0),
                new Employee(6, "Sumaree", 43000.0)
        ));

        task2.put("Accounting", Arrays.asList(
                new Employee(4, "Cherry", 45000.0),
                new Employee(5, "Rose", 25000.0)
        ));

        task2.put("IT", Arrays.asList(
                new Employee(1, "John", 75000.0),
                new Employee(2, "Amory", 35000.0)
        ));

        task2.forEach((department, employees) -> {
            System.out.println(department);
            employees.forEach(System.out::println);
        });

        List<Employee> employees = Arrays.asList(
                new Employee(3, "Bob", 65000.0),
                new Employee(6, "Sumaree", 43000.0),
                new Employee(4, "Cherry", 45000.0),
                new Employee(5, "Rose", 25000.0),
                new Employee(1, "John", 75000.0),
                new Employee(2, "Amory", 35000.0)
        );
       /*
       [task-3]
         จากข้อ 2 จงเขียนคําสั่งโดยใช้ streams และ Lambda expression โดยใช้ collect และ Collectors.groupingBy เพื่อให้จัดกลุ่มพนักงานตามชื่อหน่วยงาน
          */
        System.out.println("------Using Stream and Lambda expression----");
        Map<String, List<Employee>> task3 = employees.stream()
                .collect(Collectors.groupingBy(e -> {
                    if (e.getId() == 3 || e.getId() == 6) return "Sale";
                    else if (e.getId() == 4 || e.getId() == 5) return "Accounting";
                    else return "IT";
                }));

        task3.forEach((department, empList) -> {
            System.out.println(department);
            empList.forEach(System.out::println);
        });
        /*
       [task-4]
        จากข้อ 2 จงเขียนคําสั่งโดยใช้ streams และ Method reference โดยใช้ collect และ
        Collectors.groupingBy เพื่อให้จัดกลุ่มพนักงานตามชื่อหน่วยงาน
        */
        System.out.println("------Using Stream and Method Reference----");

        Map<String, List<Employee>> task4 = employees.stream()
                .collect(Collectors.groupingBy(Task4_StreamMethodReference::assignDepartment));

        task4.forEach((department, empList) -> {
            System.out.println(department);
            empList.forEach(System.out::println);
        });
         /*
       [task-5]
        จงเขียนคําสั่ง เพื่อให้ผลลัพธ์ดังต่อไปนี้

        ---using stream of the entrySet() and sorted by department and employee Name ---
        Accounting
        4,Cherry, 45000.0
        5,Rose, 25000.0
        IT
        2,Amory, 35000.0
        1,John, 75000.0
        Sale
        3,Bob, 65000.0
        6,Sumaree, 43000.0

        คําแนะนํา: เป็นโค้ดบ้างส่วน โดยให้นักศึกษา มองว่า entrySet() เป็นกลุ่มที่จะแปลงเป็นStream แล้วให้เรียง
        ตามชื่อหน่วยงาน แล้ววนลูป แต่ค่าของ EntrySet คือ List<Employee> ซึ่งนักศึกษาต้องเรียงโดยใช้
        sorted โดยเรียงตามชื่อ
        */
        System.out.println("---using stream of the entrySet() and sorted by department and employee Name ---\n");
        Map<String, List<Employee>> task5 = employees.stream()
                .collect(Collectors.groupingBy(Task5_StreamSorting::assignDepartment));

        task5.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().stream()
                            .sorted(Comparator.comparing(e -> e.getName()))
                            .forEach(System.out::println);
                });
    }
}
