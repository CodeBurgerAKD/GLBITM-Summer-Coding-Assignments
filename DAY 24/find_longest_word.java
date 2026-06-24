import java.util.*;


public class find_longest_word {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String longestWord = "";

        for(String word : words) {
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
    
}
