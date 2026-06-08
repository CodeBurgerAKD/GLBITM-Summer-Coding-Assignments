import java.util.*;

public class set_bits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = temp >> 1;
        }

        System.out.println("Number of set bits: " + count);
    }
}
