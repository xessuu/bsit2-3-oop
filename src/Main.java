package employees;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Alice Smith", 2001, 80000.0, "Engineering", 15000.0, 8);
        Developer developer = new Developer("Bob Johnson", 2002, 70000.0, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2003, 30000.0, "Engineering", "Tech University", true);

        System.out.println("\n--- Manager Details ---");
        manager.displayInfo();
        System.out.println("Monthly Salary: $" + String.format("%.2f", manager.calculateSalary()));
        manager.work();

        System.out.println("\n--- Developer Details ---");
        developer.displayInfo();
        System.out.println("Monthly Salary: $" + String.format("%.2f", developer.calculateSalary()));
        developer.work();

        System.out.println("\n--- Intern Details ---");
        intern.displayInfo();
        System.out.println("Monthly Salary: $" + String.format("%.2f", intern.calculateSalary()));
        intern.work();
    }
}
