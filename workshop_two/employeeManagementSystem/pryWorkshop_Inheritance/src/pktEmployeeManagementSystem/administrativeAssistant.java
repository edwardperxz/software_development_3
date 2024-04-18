package pktEmployeeManagementSystem;

public class administrativeAssistant extends employee {
    private boolean fullTime;

    public administrativeAssistant(String name, int id, double baseSalary, boolean fullTime) {
        super(name, id, baseSalary);
        this.fullTime = fullTime;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public Object manageDocumentation() {
        System.out.println("Managing documents...");
        return null;
    }

    public void coordinateMeetings() {
        System.out.println("Coordinating meetings...");
    }

    public void answerCalls() {
        System.out.println("Answering calls...");
    }
}
