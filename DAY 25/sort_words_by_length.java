import java.util.*;


public class sort_words_by_length {
    public static void sortWords(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words you want to sort: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] words = new String[n];

        System.out.println("Enter the words");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        
        sortWords(words);
        
        System.out.println("Sorted by length: " + Arrays.toString(words));

    }

}
