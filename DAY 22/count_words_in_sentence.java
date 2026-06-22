import java.util.*;


public class count_words_in_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        int wordCount = words.length;

        System.out.println("Number of words in the sentence: " + wordCount);
    }
}
