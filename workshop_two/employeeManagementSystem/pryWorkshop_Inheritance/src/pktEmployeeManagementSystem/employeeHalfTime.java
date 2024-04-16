package pktEmployeeManagementSystem;

public class employeeHalfTime extends employee {
    private double bonusSalary;

    public employeeHalfTime(String name, int id, double baseSalary, double bonusSalary) {
        super(name, id, baseSalary);
        this.bonusSalary = bonusSalary;
    }

    public employeeHalfTime(int hoursWorked) {
    }

    public void requestVacation() {
    }

    public void registerAttendance() {
    }

    public void receiveBonus() {
    }
}