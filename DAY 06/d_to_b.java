import java.util.*;


public class d_to_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int temp = d;

    int binary = 0;
    int place = 1;

    while(temp > 0) {
        int r = temp % 2;
        binary = binary + (r * place);
        place *= 10;
        temp /= 2;
    }

    System.out.println(binary);

    }
}
