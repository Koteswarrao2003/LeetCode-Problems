import java.util.*;
public class MedianOfTwoSortedArrays{
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of first array: ");
            int n1 = sc.nextInt();
            int[] arr1 = new int[n1];
            
            System.out.println("Enter elements of first array:");
            for (int i = 0; i < n1; i++) {
                arr1[i] = sc.nextInt();
            }
            
            
            System.out.print("Enter size of second array: ");
            int n2 = sc.nextInt();
            int[] arr2 = new int[n2];
            
            System.out.println("Enter elements of second array:");
            for (int i = 0; i < n2; i++) {
                arr2[i] = sc.nextInt();
            }
            
            MedianOfTwoSortedArrays md = new MedianOfTwoSortedArrays();
            double value = md.findMedianSortedArrays(arr1, arr2);
            
            System.out.println("Median is: " + value);
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];

        int index=0;

        for(int i=0;i<nums1.length;i++){
            arr[index]=nums1[i];
            index++;
        }

        for(int j=0;j<nums2.length;j++){
            arr[index]=nums2[j];
            index++;
        }

        Arrays.sort(arr);

        

        if(arr.length%2==1){
            int oddMid=arr.length/2;
            double value=arr[oddMid];
            return value;
        }else if(arr.length%2==0){
            int firstValue=arr[arr.length/2];
            int secondValue=arr[(arr.length/2)-1];
            int sum=firstValue+secondValue;
            double value=sum/2.0;
            return value;
        }
        return 0;
    }
}