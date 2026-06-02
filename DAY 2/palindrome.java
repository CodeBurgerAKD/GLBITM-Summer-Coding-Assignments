import java.util.*;


public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = (reversedNum * 10) + digit;
            num = num / 10;
        }

        if (originalNum == reversedNum) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
        
        
    } 
    
}
