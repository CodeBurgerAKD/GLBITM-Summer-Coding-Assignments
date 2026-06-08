import java.util.*;


public class binary_to_decimal {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int temp = b;

        int decimal = 0;
        int place = 1;

        while(temp > 0) {
            int r = temp % 10;
            decimal = decimal + (r * place);
            place *= 2;
            temp /= 10;
        }

        System.out.println(decimal);
    }
  
}
