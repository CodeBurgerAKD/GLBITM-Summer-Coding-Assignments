import java.util.*;


public class check_string_rotation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not a rotation");
            return;
        }
        String temp = str1 + str1;

        if(temp.contains(str2)) {
            System.out.println("Is a rotation");
        }
        else {
            System.out.println("Not a rotation");
        }
    }
    
}
