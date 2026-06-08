import java.util.*;


public class reverse {
    public static int reverseNumber(int num, int rev) {
        
        if (num == 0) {
            return rev;
        }
        
        rev = (rev * 10) + (num % 10);
        
        
        return reverseNumber(num / 10, rev);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int reversedNum = reverseNumber(num, 0); 
        System.out.println("Reverse is: " + reversedNum);
    }
}
