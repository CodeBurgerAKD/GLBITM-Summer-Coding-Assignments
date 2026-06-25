import java.util.*;


public class common_char_in_string {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for(int i=0; i<str1.length(); i++) {
            set1.add(str1.charAt(i));
        }

        for(int i=0; i<str2.length(); i++) {
            set2.add(str2.charAt(i));
        }

        set1.retainAll(set2);

        System.out.println(set1);
    }
}
