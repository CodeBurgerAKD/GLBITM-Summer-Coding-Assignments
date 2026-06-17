import java.util.*;


public class max_freq {
    public static int maxFreqElement(int[] arr) {

        Map<Integer, Integer> result = new HashMap<>();
        int maxFreq = 0;
        int maxElement = arr[0];

        for (int num : arr) {
            int count = result.getOrDefault(num, 0) + 1;
            result.put(num, count);
            
            if (count > maxFreq) {
                maxFreq = count;
                maxElement = num;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxFreqElement = maxFreqElement(arr);
        
        System.out.println("The element with the maximum frequency is: " + maxFreqElement);
    }
}
