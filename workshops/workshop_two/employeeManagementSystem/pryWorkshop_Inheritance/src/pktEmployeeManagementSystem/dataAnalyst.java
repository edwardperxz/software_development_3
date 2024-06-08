package pktEmployeeManagementSystem;

public class dataAnalyst extends employee {
    private String dataSpecialization;

    public dataAnalyst(String name, int id, double baseSalary, String dataSpecialization) {
        super(name, id, baseSalary);
        this.dataSpecialization = dataSpecialization;
    }

    public String getDataSpecialization() {
        return dataSpecialization;
    }

    public void setDataSpecialization(String dataSpecialization) {
        this.dataSpecialization = dataSpecialization;
    }

    public void analyzeData() {
        System.out.println("Analyzing data...");
    }

    public void generateAnalysisReport() {
        System.out.println("Generating analysis report...");
    }

    public void developPredictiveModels() {
        System.out.println("Developing predictive models...");
    }
}
