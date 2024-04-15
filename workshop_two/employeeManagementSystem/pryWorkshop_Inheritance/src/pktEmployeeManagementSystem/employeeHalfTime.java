package pktEmployeeManagementSystem;

public class employeeHalfTime extends employee {
    private double bonusSalary;

    public employeeHalfTime(String name, int id, double baseSalary, double bonusSalary) {
        super(name, id, baseSalary);
        this.bonusSalary = bonusSalary;
    }

    public void requestVacation() {
        // Implementación para solicitar vacaciones
    }

    public void registerAttendance() {
        // Implementación para registrar asistencia
    }

    public void receiveBonus() {
        // Implementación para recibir bono
    }
}