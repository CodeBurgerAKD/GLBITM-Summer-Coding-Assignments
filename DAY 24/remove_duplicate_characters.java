import java.util.*;


public class remove_duplicate_characters {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i= 0; i < str.length(); i++) {
            if(i == str.length() - 1 || str.charAt(i) != str.charAt(i+1)) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
    
}
