import java.util.*;

public class AbsoluteDifferenceBetweenMaxAndMin {

    public static int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int smallest = 0;
        int largest = 0;

        for (int i = 0; i < k; i++) {
            smallest += nums[i];
        }

        for (int i = nums.length - k; i < nums.length; i++) {
            largest += nums[i];
        }

        return Math.abs(largest - smallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = absDifference(nums, k);
        System.out.println("Absolute Difference: " + result);

        sc.close();
    }
}
