import java.util.*;


public class mini_employee_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String[] employees = new String[100];
        int size = 0;

        do{
            System.out.println("Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (size < employees.length) {
                        System.out.print("Enter employee name to add: ");
                        employees[size] = sc.nextLine();
                        size++;
                        System.out.println("Employee added.");
                    }
                    else {
                        System.out.println("Employee list is full. Cannot add more employees.");
                    }
                    break;

                case 2:
                    if (size > 0) {
                        System.out.print("Enter index of employee to remove (0 to " + (size - 1) + "): ");
                        int index = sc.nextInt();
                        if (index >= 0 && index < size) {
                            for (int i = index; i < size - 1; i++) {
                                employees[i] = employees[i + 1];
                            }
                            size--;
                            System.out.println("Employee removed.");
                        }
                        else {
                            System.out.println("Invalid index.");
                        }
                    }
                    else {
                        System.out.println("Employee list is empty. Cannot remove employees.");
                    }
                    break;

                case 3:
                    if (size > 0) {
                        System.out.println("Employees:");
                        for (int i = 0; i < size; i++) {
                            System.out.println(i + ": " + employees[i]);
                        }
                    }
                    else {
                        System.out.println("No employees to display.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
        
        while(choice != 4);

    }

}
