import java.util.*;


public class mini_library_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String[] books = new String[100];
        int size = 0;

        do{
            System.out.println("Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (size < books.length) {
                        System.out.print("Enter book name to add: ");
                        books[size] = sc.nextLine();
                        size++;
                        System.out.println("Book added.");
                    }
                    else {
                        System.out.println("Library is full. Cannot add more books.");
                    }
                    break;

                case 2:
                    if (size > 0) {
                        System.out.print("Enter index of book to remove (0 to " + (size - 1) + "): ");
                        int index = sc.nextInt();
                        if (index >= 0 && index < size) {
                            for (int i = index; i < size - 1; i++) {
                                books[i] = books[i + 1];
                            }
                            size--;
                            System.out.println("Book removed.");
                        }
                        else {
                            System.out.println("Invalid index.");
                        }
                    }
                    else {
                        System.out.println("Library is empty. Cannot remove books.");
                    }
                    break;

                case 3:
                    if (size > 0) {
                        System.out.println("Library books:");
                        for (int i = 0; i < size; i++) {
                            System.out.println(i + ": " + books[i]);
                        }
                    }
                    else {
                        System.out.println("Library is empty.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
        
        while(choice != 4);

    }

}
