import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new JavaDeveloper("Alice Smith", 2001, 80000, "Engineering", true, 8));
        employees.add(new Developer("Bob Johnson", 2002, 70000, "Engineering", true, "Java", 5));
        employees.add(new Manager("Charlie Brown", 2003, 30000, "Engineering", true, "Tech Team", 4, 15000));

        for (Employee e : employees) {
            System.out.println("==EMPLOYEE MANAGEMENT SYSTEM==");
            System.out.println(e.toString());
            System.out.println();
        }
    }
}
