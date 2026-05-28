import java.util.*;

public class digits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            n /= 10; // Remove the last digit
            count++; // Increment the count of digits
        }

        System.out.println(count);
    }
}
