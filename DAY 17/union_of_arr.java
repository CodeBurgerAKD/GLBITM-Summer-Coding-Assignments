import java.util.*;


public class union_of_arr {
    public static HashSet<Integer> findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> result = new HashSet<>();
        
        for (int num : arr1) {
            result.add(num);
        }
        for (int num : arr2) {
            result.add(num);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        HashSet<Integer> result = findUnion(arr1, arr2);
        
        System.out.println("Union of the two arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
