package pktEmployeeManagementSystem;

public class manager extends employee {
    private String department;

    public manager(String name, int id, double baseSalary, String department) {
        super(name, id, baseSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void assignTasks() {
        System.out.println("Assigning tasks...");
    }

    public void manageTeam() {
        System.out.println("Managing team...");
    }

    public void createReports() {
        System.out.println("Creating reports...");
    }
}
