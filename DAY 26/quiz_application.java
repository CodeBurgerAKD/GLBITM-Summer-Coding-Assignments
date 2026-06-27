import java.util.*;


public class quiz_application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int score = 0;
        System.out.println("What is 2 + 2? (a) 3 (b) 4 (c) 5 (d) 6");

        if (sc.next().equals("b")) score++;
        System.out.println("Final Score: " + score);

    }

}
