import java.util.*;


public class sort_names_alphabetically {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        sc.nextLine();

        String[] names = new String[n];

        for(int i=0; i<n; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        for(String name : names) {
            System.out.println(name);
        }
    }
}
