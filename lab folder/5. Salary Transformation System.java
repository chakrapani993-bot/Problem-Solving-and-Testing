
public class SalaryTransformationSystem {

    public static void main(String[] args) {
        String employeeName = "Ravi";
        double basicSalary = 30000;

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.12;

        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - pf;

        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Basic Salary: %.2f%n", basicSalary);
        System.out.printf("HRA: %.2f%n", hra);
        System.out.printf("DA: %.2f%n", da);
        System.out.printf("PF Deduction: %.2f%n", pf);
        System.out.printf("Gross Salary: %.2f%n", grossSalary);
        System.out.printf("Net Salary: %.2f%n", netSalary);
    }
}


Employee Name: Ravi
Basic Salary: 30000.00
HRA: 6000.00
DA: 3000.00
PF Deduction: 3600.00
Gross Salary: 39000.00
Net Salary: 35400.00
