public class Intern extends Employee {
    private String university;

    public Intern(String name, int employeeId, double baseSalary, String department, boolean fullTime, String university) {
        super(name, employeeId, baseSalary, department, fullTime);
        this.university = university;
    }

    @Override
    public double calculateMonthlySalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("%nUniversity: %s%nMonthly Salary: $%.2f",
                        university, calculateMonthlySalary());
    }
}
