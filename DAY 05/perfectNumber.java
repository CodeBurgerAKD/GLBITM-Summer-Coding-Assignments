import java.util.*;


public class perfectNumber {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    int sum = 0;

    for (int i = 1; i <= n/2; i++) {
        if (n % i == 0 ) {
            sum += i;
        }
    }

    if (sum == n && n != 0) {
        System.out.println(" Perfect number ");
    }
    
    else {
        System.out.println(" not a Perfect number ");
    }
}
