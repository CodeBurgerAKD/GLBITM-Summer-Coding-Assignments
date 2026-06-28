import java.util.*;


public class ticket_booking_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tickets: ");
        int n = sc.nextInt();

        String[] passengerNames = new String[n];
        String[] destinations = new String[n];

        int count = 0;

        while(count < n) {
            System.out.println("Enter details for ticket " + (count + 1) + ":");

            System.out.print("Passenger Name: ");
            sc.nextLine();
            passengerNames[count] = sc.nextLine();

            System.out.print("Destination: ");
            destinations[count] = sc.nextLine();

            count++;
        }

        System.out.println("\nTicket Booking Records:");
        
        for(int i = 0; i < n; i++) {
            System.out.println("Ticket " + (i + 1) + "--> Passenger Name: " + passengerNames[i] + ", Destination: " + destinations[i]);
        }

    }
    
}
