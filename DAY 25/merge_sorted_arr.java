import java.util.*;


public class merge_sorted_arr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArr = new int[n + m];
        int i = 0, j = 0, k = 0;

        while(i < n && j < m) {
            if(arr1[i] < arr2[j]) {
                mergedArr[k++] = arr1[i++];
            }
            else {
                mergedArr[k++] = arr2[j++];
            }
        }

        while(i < n) {
            mergedArr[k++] = arr1[i++];
        }

        while(j < m) {
            mergedArr[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(mergedArr));
    }
}
