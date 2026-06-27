import java.util.*;


public class salary_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] salaries = new double[n];

        double totalPayroll = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();

            System.out.print("Salary: ");
            salaries[i] = sc.nextDouble();
            sc.nextLine(); 

            totalPayroll += salaries[i];
        }

        System.out.println("\n--- Salary Report ---");

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + " --> " + names[i] + " : Rs" + salaries[i]);
        }

        System.out.println("Total Monthly Payroll: Rs" + totalPayroll);

    }

}
