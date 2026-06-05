import java.util.*;


public class strongNumber {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int orig_no = n;
    int result = 0;
    while (orig_no > 0) {
        int r = orig_no % 10;
        int fact = 1;

        for (int i = 1; i <= r; i++) {
            fact *= i;
        }

        result += fact;
        orig_no /= 10;
    }

    if (result == n) {
        System.out.println(" Strong number ");
    }
    
    else {
        System.out.println(" not a Strong number ");
    }
}
