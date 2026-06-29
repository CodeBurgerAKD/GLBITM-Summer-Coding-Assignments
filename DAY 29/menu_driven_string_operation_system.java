import java.util.*;


public class menu_driven_string_operation_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String str1, str2, result;

        do{
            System.out.println("Menu:");
            System.out.println("1. Concatenation");
            System.out.println("2. Length of String");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter first string: ");
                    str1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    str2 = sc.nextLine();
                    result = str1 + str2;
                    System.out.println("Concatenated String: " + result);
                    break;

                case 2:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    int length = str1.length();
                    System.out.println("Length of the string: " + length);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
        
        while (choice != 3);
        
    }
    
}
