import java.util.*;

public class ShuffleArray {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter value of n: ");
            int n = sc.nextInt();
            
            int[] nums = new int[2 * n];
            
            System.out.println("Enter " + (2 * n) + " array elements:");
            for (int i = 0; i < 2 * n; i++) {
                nums[i] = sc.nextInt();
            }
            
            Solution s = new Solution();
            int[] result = s.shuffle(nums, n);
            
            System.out.print("Shuffled array: ");
            for (int val : result) {
                System.out.print(val + " ");
            }
        }
    }
}

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            arr[index++] = nums[i];
            arr[index++] = nums[i + n];
        }

        return arr;
    }
}
