package pktEmployeeManagementSystem;

public class employee {
    private String name;
    private int id;
    public double baseSalary;

    public employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateTotalSalary() {
        return baseSalary;
    }

    public void displayEmployeeInformation() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base Salary: " + baseSalary);
    }
}
