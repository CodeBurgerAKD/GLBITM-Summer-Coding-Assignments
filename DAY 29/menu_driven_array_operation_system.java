import java.util.*;

public class menu_driven_array_operation_system {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        int[] arr = new int[100];
        int size = 0;

        do{
            System.out.println("Menu:");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Display Array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (size < arr.length) {
                        System.out.print("Enter element to insert: ");
                        arr[size] = sc.nextInt();
                        size++;
                        System.out.println("Element inserted.");
                    }
                    else {
                        System.out.println("Array is full. Cannot insert more elements.");
                    }
                    break;

                case 2:
                    if (size > 0) {
                        System.out.print("Enter index of element to delete (0 to " + (size - 1) + "): ");
                        int index = sc.nextInt();
                        if (index >= 0 && index < size) {
                            for (int i = index; i < size - 1; i++) {
                                arr[i] = arr[i + 1];
                            }
                            size--;
                            System.out.println("Element deleted.");
                        }
                        else {
                            System.out.println("Invalid index.");
                        }
                    }
                    else {
                        System.out.println("Array is empty. Cannot delete elements.");
                    }
                    break;

                case 3:
                    if (size > 0) {
                        System.out.print("Array elements: ");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    else {
                        System.out.println("Array is empty.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
        
        while (choice != 4);

    }

}
