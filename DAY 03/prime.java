import java.util.*;


public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int count = 0;

        if (num <= 1) {
            count++;
        }
          
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        }

        if (count == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }    
}
