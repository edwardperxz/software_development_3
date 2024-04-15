package pktEmployeeManagementSystem;

public class employeeFullTime extends employee {
    private int hoursWorked;

    public employeeFullTime(String name, int id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public void requestPermission() {
        // Implementación para solicitar permiso
    }

    public void organizeInventory() {
        // Implementación para organizar inventario
    }

    public void attendCustomer() {
        // Implementación para atender clientes
    }
}
