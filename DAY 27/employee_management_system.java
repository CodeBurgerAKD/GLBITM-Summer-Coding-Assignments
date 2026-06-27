import java.util.*;


public class employee_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        String[] designations = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();

            System.out.print("Designation: ");
            designations[i] = sc.nextLine();
        }

        System.out.println("\nEmployee List:");

        for (int i = 0; i < n; i++) {
            System.out.println("Employee "+(i + 1) + " --> " + names[i] + " (" + designations[i] + ")");
        }

    }

}
