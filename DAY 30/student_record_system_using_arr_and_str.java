import java.util.*;


public class student_record_system_using_arr_and_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] rollNumbers = new int[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();

            System.out.print("Roll Number: ");
            rollNumbers[i] = sc.nextInt();

            System.out.print("Marks: ");
            marks[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nStudent Records:");
        
        for(int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + "--> Name: " + names[i] + ", Roll Number: " + rollNumbers[i] + ", Marks: " + marks[i]);
        }

    }
    
}
