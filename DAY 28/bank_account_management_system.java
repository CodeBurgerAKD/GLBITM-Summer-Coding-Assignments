import java.util.*;


public class bank_account_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of bank accounts: ");
        int n = sc.nextInt();

        String[] accountHolders = new String[n];
        double[] balances = new double[n];

        int count = 0;

        while(count < n) {
            System.out.println("Enter details for account " + (count + 1) + ":");

            System.out.print("Account Holder Name: ");
            sc.nextLine();
            accountHolders[count] = sc.nextLine();

            System.out.print("Balance: ");
            balances[count] = sc.nextDouble();

            count++;
        }

        System.out.println("\nBank Account Records:");
        
        for(int i = 0; i < n; i++) {
            System.out.println("Account " + (i + 1) + "--> Account Holder: " + accountHolders[i] + ", Balance: $" + balances[i]);
        }

    }
    
}
