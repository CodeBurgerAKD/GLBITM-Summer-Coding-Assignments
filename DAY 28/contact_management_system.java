import java.util.*;


public class contact_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of contacts: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        String[] contactNumbers = new String[n];

        int count = 0;

        while(count < n) {
            System.out.println("Enter details for contact " + (count + 1) + ":");

            System.out.print("Name: ");
            sc.nextLine();
            names[count] = sc.nextLine();

            System.out.print("Contact Number: ");
            contactNumbers[count] = sc.nextLine();

            count++;
        }

        System.out.println("\nContact Records:");
        
        for(int i = 0; i < n; i++) {
            System.out.println("Contact " + (i + 1) + "--> Name: " + names[i] + ", Contact Number: " + contactNumbers[i]);
        }

    }

}
