package pktEmployeeManagementSystem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        employee employee = new employee("Jose Gonzalez", 1, 1000.0);

        accountant accountant = new accountant("Julia Lopez", 2, 1400.0);

        administrativeAssistant adminAssistant = new administrativeAssistant("Maria Ortega", 3, 900.0, true);

        dataAnalyst dataAnalyst = new dataAnalyst("Michael Jarson", 4, 1200.0, "Data Science");

        financialConsultant financeConsultant = new financialConsultant("Wilson Balls", 5, 2000.0, "Financial Planning");

        graphicDesigner graphicDesigner = new graphicDesigner("Charlie Charles", 6, 1000.0, true);

        humanResources hr = new humanResources("Gloria Trevi", 7, 2300.0, "Recruitment");

        manager manager = new manager("Tulio Patiño", 8, 3000.0, "Project Management");

        secretary secretary = new secretary("Linda Serrano", 9, 3000.0, true);

        softwareEngineer softwareEngineer = new softwareEngineer("Farrokh Bulsara", 5, 2500.0, 40, "Java");

        supportTechnician supportTechnician = new supportTechnician("Austin Post", 10, "Hardware");


        while (!exit) {
            System.out.println("Welcome to Employee Management System");
            System.out.println("Select an option:");
            System.out.println("1. Calculate total salary for Employee");
            System.out.println("2. Display employee information");
            System.out.println("3. Manage agenda for Secretary");
            System.out.println("4. Calculate tax deductions for Accountant");
            System.out.println("5. Manage documentation for Administrative Assistant");
            System.out.println("6. Analyze data for Data Analyst");
            System.out.println("7. Advise clients for Financial Consultant");
            System.out.println("8. Design visual material for Graphic Designer");
            System.out.println("9. Recruit personnel for Human Resources");
            System.out.println("10. Assign tasks for Manager");
            System.out.println("11. Develop software for Software Engineer");
            System.out.println("12. Resolve issues for Support Technician");
            System.out.println("0. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Total salary for Employee: $" + employee.calculateTotalSalary());
                    break;
                case 2:
                    employee.displayEmployeeInformation();
                    break;
                case 3:
                    secretary.manageAgenda();
                    break;
                case 4:
                    System.out.println("Tax deductions for Accountant: $" + accountant.calculateTaxDeductions());
                    break;
                case 5:
                    adminAssistant.manageDocumentation();
                    break;
                case 6:
                    dataAnalyst.analyzeData();
                    break;
                case 7:
                    financeConsultant.adviseClients();
                    break;
                case 8:
                    graphicDesigner.designVisualMaterial();
                    break;
                case 9:
                    hr.recruitPersonnel();
                    break;
                case 10:
                    manager.assignTasks();
                    break;
                case 11:
                    softwareEngineer.developSoftware();
                    break;
                case 12:
                    supportTechnician.resolveIssues();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
            if (!exit) {
                System.out.println("Do you want to continue? (yes/no)");
                String choice = scanner.nextLine().toLowerCase();
                if (!choice.equals("yes")) {
                    exit = true;
                }
            }
        }
            scanner.close();
            System.out.println("Exiting Employee Management System...");
    }
}