import java.util.*;


public class sec_largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
        }

        else{
            
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (nums[i] > largest) {
                    secondLargest = largest;
                    largest = nums[i];
                }
            
                else if (nums[i] > secondLargest && nums[i] != largest) {
                    secondLargest = nums[i];
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println(" No second largest element exists.");
            }
        
            else {
                System.out.println(" Second largest element is: " + secondLargest);
            }

        }
    }

}
