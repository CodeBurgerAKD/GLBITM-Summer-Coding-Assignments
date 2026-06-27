import java.util.*;


public class marksheet_generation_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] rollNos = new int[n];
        float[] marks = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();

            System.out.print("Roll Number: ");
            rollNos[i] = sc.nextInt();

            System.out.print("Marks: ");
            marks[i] = sc.nextFloat();
        }

        System.out.println("\nMarksheet:");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " --> Name: " + names[i] + ", Roll Number: " + rollNos[i] + ", Marks: " + marks[i]);
        }
    }
}
