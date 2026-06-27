import java.util.*;

public class num_guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = new Random().nextInt(100) + 1; 
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != target) {
            
            guess = sc.nextInt();

            if (guess < target){
                System.out.println("Too low, try again:");
            }
            else if (guess > target){
                System.out.println("Too high, try again:");
            }
            else{
                System.out.println("Correct!");
            }
        }

    }

}
