package pktEmployeeManagementSystem;

public class employeePartTime extends employee {
    private double bonusSalary;

    public employeePartTime(String name, int id, double baseSalary, double bonusSalary) {
        super(name, id, baseSalary);
        this.bonusSalary = bonusSalary;
    }

    public employeePartTime() {
        super();
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    @Override
    public double calculateTotalSalary() {
        return baseSalary + bonusSalary;
    }
}
