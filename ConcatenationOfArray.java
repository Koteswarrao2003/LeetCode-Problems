import java.util.*;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of the array: ");
            int n = sc.nextInt();
            
            int[] nums = new int[n];
            
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            
            Solution s = new Solution();
            int[] result = s.getConcatenation(nums);
            
            System.out.print("Concatenated array: ");
            for (int val : result) {
                System.out.print(val + " ")
            }
        }
    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
