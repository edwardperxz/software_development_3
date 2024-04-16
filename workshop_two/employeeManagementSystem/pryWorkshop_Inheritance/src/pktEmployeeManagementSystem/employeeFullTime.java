package pktEmployeeManagementSystem;

public class employeeFullTime extends employee {
    private int hoursWorked;

    public employeeFullTime(String name, int id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public void requestPermission() {
    }

    public void organizeInventory() {
    }

    public void attendCustomer() {
    }
}
