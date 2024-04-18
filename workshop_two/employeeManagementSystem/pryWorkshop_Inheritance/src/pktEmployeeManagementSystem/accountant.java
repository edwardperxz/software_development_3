package pktEmployeeManagementSystem;

public class accountant {
    private String name;
    private int id;
    private double salary;

    public accountant(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double calculateTaxDeductions() {
        // Implementación para calcular las deducciones fiscales
        return salary * 0.15; // Ejemplo de cálculo de deducciones
    }
}
