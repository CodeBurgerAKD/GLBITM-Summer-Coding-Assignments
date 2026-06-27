import java.util.*;


public class atm_simulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 1000.0; 

        while (true) {

            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your balance is: $%.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    if(depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("$%.2f deposited. New balance: $%.2f%n", depositAmount, balance);
                    }
                    else{
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("$%.2f withdrawn. New balance: $%.2f%n", withdrawAmount, balance);
                    }
                    else {
                        System.out.println("Invalid withdrawal amount or insufficient funds.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return; 
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }

    }
    
}
