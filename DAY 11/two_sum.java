import java.util.*;


public class two_sum {
    
    public static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int result = findSum(num1, num2);
        System.out.println(result);
        
    }
    
}
