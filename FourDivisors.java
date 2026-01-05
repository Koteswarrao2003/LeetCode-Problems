import java.util.Scanner;

public class FourDivisors {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            
            int arr[] = new int[n];
            
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            FourDivisors fd = new FourDivisors();
            int res = fd.sumOfFourDivisors(arr);
            
            System.out.println("Result is: " + res);
        }
    }

    public int sumOfFourDivisors(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int tempSum = 0;

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                    tempSum += j;
                }
            }

            if (count == 4) {
                sum += tempSum;
            }
        }

        return sum;
    }
}
