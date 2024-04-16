package pktEmployeeManagementSystem;

public class graphicDesigner extends employeeHalfTime {
    private boolean graphicDesigner=true;
    public graphicDesigner(int HoursWorked) {
        super(HoursWorked);
        this.graphicDesigner = graphicDesigner;
    }
    public void designVisualMaterial () {
        System.out.println("Diagramas");
    }

    public void colaborateOnCreativeProjects () {

        System.out.println("tablas y gráficos");
    }

    public void presentDesignProposals () {
        System.out.println("Fotografias y imágenes");
    }
}