package pktEmployeeManagementSystem;

public class graphicDesigner extends employee {
    private boolean graphicDesigner;

    public graphicDesigner(String name, int id, double baseSalary, boolean graphicDesigner) {
        super(name, id, baseSalary);
        this.graphicDesigner = graphicDesigner;
    }

    public boolean isGraphicDesigner() {
        return graphicDesigner;
    }

    public void setGraphicDesigner(boolean graphicDesigner) {
        this.graphicDesigner = graphicDesigner;
    }

    public void designVisualMaterial() {
        System.out.println("Designing visual material...");
    }

    public void collaborateOnCreativeProjects() {
        System.out.println("Collaborating on creative projects...");
    }

    public void presentDesignProposals() {
        System.out.println("Presenting design proposals...");
    }
}
