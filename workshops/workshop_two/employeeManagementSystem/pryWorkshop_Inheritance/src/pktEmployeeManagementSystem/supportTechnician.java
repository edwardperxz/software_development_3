package pktEmployeeManagementSystem;

public class supportTechnician extends employeePartTime{
    private String name;
    private int id;
    private String areaOfExpertise;
    private String supportArea;

    public supportTechnician(String name, int id, String areaOfExpertise) {
        super();
        this.name = name;
        this.id = id;
        this.areaOfExpertise = areaOfExpertise;
    }
    public void resolveIssues() {
        System.out.println("Resolving technical issues in " + supportArea);
    }

    public void updateSoftware() {
        System.out.println("Updating software and systems");
    }

    public void provideAssistance() {
        System.out.println("Providing technical assistance to users");
    }
}
