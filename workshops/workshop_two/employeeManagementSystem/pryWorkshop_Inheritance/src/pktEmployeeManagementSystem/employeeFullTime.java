package pktEmployeeManagementSystem;

public class employeeFullTime extends employee {
    private int hoursWorked;

    public employeeFullTime(String name, int id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateTotalSalary() {
        return baseSalary * hoursWorked;
    }
}