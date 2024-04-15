package pktEmployeeManagementSystem;

public class financialConsultant extends employeeHalfTime {
    private boolean FinancialConsultant=true;
    public financialConsultant(int HoursWorked) {
        super(HoursWorked);
        this.FinancialConsultant = FinancialConsultant;
    }
    public void adviseClients () {
        System.out.println("advise");
    }

    public void conductMarketAnalysis () {
        System.out.println("analysis");
    }

    public void prepareFinancialReports () {
        System.out.println("reports");
    }
}
