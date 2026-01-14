import java.util.Scanner;

public class NRepeatedElements {

    public static int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                return nums[i]; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of an array: ");
            int size = sc.nextInt();
            
            int[] nums = new int[size];
            
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }
            
            int result = repeatedNTimes(nums);
            System.out.println("Repeated element is: " + result);
        }
    }
}
