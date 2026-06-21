import java.util.*;


public class conv_lower_to_upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String output = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            output += Character.toUpperCase(ch);
        }
        
        System.out.println("Uppercase: " + output);
    }
}
