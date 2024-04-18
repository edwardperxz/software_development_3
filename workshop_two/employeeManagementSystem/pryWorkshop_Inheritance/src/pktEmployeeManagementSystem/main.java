package pktEmployeeManagementSystem;

import java.util.Scanner;

            public class Main {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    boolean exit = false;

                    while (!exit) {
                        System.out.println("Welcome to Employee Management System");
                        System.out.println("Select an option:");
                        System.out.println("1. Calculate total salary for an employee");
                        System.out.println("2. Calculate tax deductions for an accountant");
                        System.out.println("3. Advise clients for a financial consultant");
                        System.out.println("4. Design visual material for a graphic designer");
                        System.out.println("5. Recruit employees for Human Resources");
                        System.out.println("6. Assign tasks for a Manager");
                        System.out.println("7. Coordinate tasks for a Project Coordinator");
                        System.out.println("8. Manage agenda for a Secretary");
                        System.out.println("9. Develop software for a Software Engineer");
                        System.out.println("10. Resolve issues for a Support Technician");
                        System.out.println("0. Exit");

                        int option = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        switch (option) {
                            case 1:
                                System.out.println("Calculating total salary for an employee...");
                                // Code to calculate total salary for an employee
                                break;
                            case 2:
                                System.out.println("Calculating tax deductions for an accountant...");
                                // Code to calculate tax deductions for an accountant
                                break;
                            case 3:
                                System.out.println("Advising clients for a financial consultant...");
                                // Code to advise clients for a financial consultant
                                break;
                            case 4:
                                System.out.println("Designing visual material for a graphic designer...");
                                // Code to design visual material for a graphic designer
                                break;
                            case 5:
                                System.out.println("Recruiting employees for Human Resources...");
                                // Code to recruit employees for Human Resources
                                break;
                            case 6:
                                System.out.println("Assigning tasks for a Manager...");
                                // Code to assign tasks for a Manager
                                break;
                            case 7:
                                System.out.println("Coordinating tasks for a Project Coordinator...");
                                // Code to coordinate tasks for a Project Coordinator
                                break;
                            case 8:
                                System.out.println("Managing agenda for a Secretary...");
                                // Code to manage agenda for a Secretary
                                break;
                            case 9:
                                System.out.println("Developing software for a Software Engineer...");
                                // Code to develop software for a Software Engineer
                                break;
                            case 10:
                                System.out.println("Resolving issues for a Support Technician...");
                                // Code to resolve issues for a Support Technician
                                break;
                            case 0:
                                exit = true;
                                break;
                            default:
                                System.out.println("Invalid option. Please try again.");
                                break;
                        }
                    }

                    scanner.close();
                    System.out.println("Exiting Employee Management System...");
                }

                }
