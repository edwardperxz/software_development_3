package pktEmployeeManagementSystem;

public class financialConsultant extends employee {
    private String financeExpertise;

    public financialConsultant(String name, int id, double baseSalary, String financeExpertise) {
        super(name, id, baseSalary);
        this.financeExpertise = financeExpertise;
    }

    public String getFinanceExpertise() {
        return financeExpertise;
    }

    public void setFinanceExpertise(String financeExpertise) {
        this.financeExpertise = financeExpertise;
    }

    public void adviseClients() {
        System.out.println("Advising clients...");
    }

    public void conductMarketAnalysis() {
        System.out.println("Conducting market analysis...");
    }

    public void prepareFinancialReports() {
        System.out.println("Preparing financial reports...");
    }
}
