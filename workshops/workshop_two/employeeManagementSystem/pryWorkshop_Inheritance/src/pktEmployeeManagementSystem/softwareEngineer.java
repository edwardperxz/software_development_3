package pktEmployeeManagementSystem;

public class softwareEngineer extends employeeFullTime {
    private String programmingLanguage;

    public softwareEngineer(String name, int id, double baseSalary, int hoursWorked, String programmingLanguage) {
        super(name, id, baseSalary, hoursWorked);
        this.programmingLanguage = programmingLanguage;
    }

    public void developSoftware() {
        System.out.println("Developing software using " + programmingLanguage);
    }

    public void performTesting() {
        System.out.println("Performing testing and debugging");
    }

    public void maintainSystems() {
        System.out.println("Maintaining software systems and applications");
    }
}