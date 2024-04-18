package pktEmployeeManagementSystem;

public class secretary extends employee {
    private boolean fullTime;

    public secretary(String name, int id, double baseSalary, boolean fullTime) {
        super(name, id, baseSalary);
        this.fullTime = fullTime;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public void manageAgenda() {
        System.out.println("Managing agenda...");
    }

    public void draftCorrespondence() {
        System.out.println("Drafting correspondence...");
    }

    public void organizeDocuments() {
        System.out.println("Organizing documents...");
    }
}
