import java.util.*;


public class library_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();

        String[] titles = new String[n];
        String[] authors = new String[n];

        int count = 0;

        while(count < n) {
            System.out.println("Enter details for book " + (count + 1) + ":");

            System.out.print("Title: ");
            sc.nextLine();
            titles[count] = sc.nextLine();

            System.out.print("Author: ");
            authors[count] = sc.nextLine();

            count++;
        }

        System.out.println("\nLibrary Records:");
        
        for(int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + "--> Title: " + titles[i] + ", Author: " + authors[i]);
        }

    }
    
}
