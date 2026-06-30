import java.util.*;


public class mini_project_using_functions {
    static String[] names;
    static int[] rollNumbers;
    static double[] marks;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        names = new String[n];
        rollNumbers = new int[n];
        marks = new double[n];

        inputRecords(sc, n);
        displayRecords(n);
        
        double avg = calculateAverage(n);
        System.out.printf("\nClass Average Marks: %.2f\n", avg);
    }

    public static void inputRecords(Scanner sc, int n) {
        for (int i = 0; i < n; i++) {
            
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();

            System.out.print("Roll Number: ");
            rollNumbers[i] = sc.nextInt();

            System.out.print("Marks: ");
            marks[i] = sc.nextDouble();

        }
    }

    public static void displayRecords(int n) {
        System.out.println("\n---Student Records---");
        
        for(int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + "--> Name: " + names[i] + ", Roll Number: " + rollNumbers[i] + ", Marks: " + marks[i]);
        }

    }

    public static double calculateAverage(int n) {
        double sum = 0;
        
        for (double m : marks){
            sum += m;
        }

        return sum / n;

    }

}
