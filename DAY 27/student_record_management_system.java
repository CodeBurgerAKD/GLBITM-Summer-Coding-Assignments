import java.util.*;


public class student_record_management_system {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] rollNos = new int[n];

        int count = 0;

        while(count < n) {
            System.out.println("Enter details for student " + (count + 1) + ":");

            System.out.print("Name: ");
            sc.nextLine();
            names[count] = sc.nextLine();

            System.out.print("Roll Number: ");
            rollNos[count] = sc.nextInt();

            count++;
        }

        System.out.println("\nStudent Records:");
        
        for(int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + "--> Name: " + names[i] + ", Roll Number: " + rollNos[i]);
        }

    }

}
