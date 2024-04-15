package pktEmployeeManagementSystem;

import javax.swing.*;

public class employee {
    private String name;
    private int id;
    private double baseSalary;
    private double totalSalary;

    public employee() {
        JFrame frame = new JFrame("Employee Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField nameField = new JTextField(50);
        JTextField idField = new JTextField(16);
        JTextField salaryField = new JTextField(16);

        panel.add(new JLabel("Enter employee name:"));
        panel.add(nameField);
        panel.add(new JLabel("Enter employee ID:"));
        panel.add(idField);
        panel.add(new JLabel("Enter employee base salary:"));
        panel.add(salaryField);

        int result = JOptionPane.showConfirmDialog(frame, panel, "Employee Information", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            name = nameField.getText();
            id = Integer.parseInt(idField.getText());
            baseSalary = Double.parseDouble(salaryField.getText());

            totalSalary = calculateSalary(baseSalary);

            JOptionPane.showMessageDialog(null, "Employee's total salary: " + totalSalary);
        } else {
            System.exit(0);
        }

        frame.dispose();
    }

    public double calculateSalary(double baseSalary) {
        return baseSalary;
    }

    public static void main(String[] args) {
        new employee();
    }
}
