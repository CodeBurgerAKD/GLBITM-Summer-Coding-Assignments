import java.util.*;


public class first_non_repeating_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        char result = firstNonRepeatingChar(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        }
        
        else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
\
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
\
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }
}
