import java.util.*;


public class sum_of_digits {
    public static int getSum(int num) {
        
        if (num == 0) {
            return 0;
        }
        
        return (num % 10) + getSum(num / 10);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Sum of digits is: " + getSum(n));
    }
}
