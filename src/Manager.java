public class Manager extends Employee {
    private String teamName;
    private int teamSize;
    private double bonus;

    public Manager(String name, int employeeId, double baseSalary, String department,
                   boolean fullTime, String teamName, int teamSize, double bonus) {
        super(name, employeeId, baseSalary, department, fullTime);
        this.teamName = teamName;
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    @Override
    public double calculateMonthlySalary() {
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("%nTeam: %s%nTeam Size: %d%nBonus: $%.2f" +
                                "%nMonthly Salary: $%.2f",
                        teamName, teamSize, bonus, calculateMonthlySalary());
    }
}
