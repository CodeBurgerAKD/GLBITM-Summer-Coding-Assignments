import java.util.*;


public class compress_string {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i= 0; i < str.length(); i++) {
            if(i == str.length() - 1 || str.charAt(i) != str.charAt(i+1)) {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
            else {
                count++;
            }
        }

        System.out.println(sb.toString());
    }
    
}
