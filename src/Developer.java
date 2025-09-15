public class Developer extends Employee {
    protected String programmingLanguage;
    protected int projectsCompleted;

    public Developer(String name, int employeeId, double baseSalary, String department,
                     boolean fullTime, String programmingLanguage, int projectsCompleted) {
        super(name, employeeId, baseSalary, department, fullTime);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public double calculateMonthlySalary() {
        return baseSalary + projectsCompleted * 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("%nProgramming Language: %s%nProjects Completed: %d%n" +
                                "Monthly Salary: $%.2f",
                        programmingLanguage, projectsCompleted, calculateMonthlySalary());
    }
}
