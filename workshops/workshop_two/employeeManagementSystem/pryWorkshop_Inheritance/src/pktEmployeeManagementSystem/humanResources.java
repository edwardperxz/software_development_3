package pktEmployeeManagementSystem;

public class humanResources extends employee {
    private String hrSpecialization;

    public humanResources(String name, int id, double baseSalary, String hrSpecialization) {
        super(name, id, baseSalary);
        this.hrSpecialization = hrSpecialization;
    }

    public String getHrSpecialization() {
        return hrSpecialization;
    }

    public void setHrSpecialization(String hrSpecialization) {
        this.hrSpecialization = hrSpecialization;
    }

    public void recruitPersonnel() {
        System.out.println("Recruiting personnel...");
    }

    public void conductTraining() {
        System.out.println("Conducting training sessions...");
    }
}

