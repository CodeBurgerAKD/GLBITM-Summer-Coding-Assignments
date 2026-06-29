import java.util.*;

public class inventory_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String[] items = new String[100];
        int size = 0;

        do{
            System.out.println("Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (size < items.length) {
                        System.out.print("Enter item name to add: ");
                        items[size] = sc.nextLine();
                        size++;
                        System.out.println("Item added.");
                    }
                    else {
                        System.out.println("Inventory is full. Cannot add more items.");
                    }
                    break;

                case 2:
                    if (size > 0) {
                        System.out.print("Enter index of item to remove (0 to " + (size - 1) + "): ");
                        int index = sc.nextInt();
                        if (index >= 0 && index < size) {
                            for (int i = index; i < size - 1; i++) {
                                items[i] = items[i + 1];
                            }
                            size--;
                            System.out.println("Item removed.");
                        }
                        else {
                            System.out.println("Invalid index.");
                        }
                    }
                    else {
                        System.out.println("Inventory is empty. Cannot remove items.");
                    }
                    break;

                case 3:
                    if (size > 0) {
                        System.out.println("Inventory items:");
                        for (int i = 0; i < size; i++) {
                            System.out.println(i + ": " + items[i]);
                        }
                    }
                    else {
                        System.out.println("Inventory is empty.");
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
