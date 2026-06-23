import java.util.*;


public class first_repeating_char {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char result = firstRepeatingChar(str);
        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        }

        else {
            System.out.println("No repeating character found.");
        }
    }

    public static char firstRepeatingChar(String str) {
        Set<Character> charSet = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (charSet.contains(c)) {
                return c;
            }
            charSet.add(c);
        }

        return '\0';

    }
}
