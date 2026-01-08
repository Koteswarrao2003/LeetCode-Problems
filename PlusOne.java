import java.util.*;
public class PlusOne{

    public static int[] plusOne(int []arr){

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }

            arr[i]=0;
        }

        int arr2[]=new int[arr.length+1];
        arr2[0]=1;
        return arr2
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        if(num==0){
            int result[]={1};
            System.out.println(Arrays.toString(result));
            return;
        }

        int temp=num;
        int count=0;

        while(num!=0){
            num/=10;
            count++;
        }

        int arr[]=new int[count];

        for(int i=arr.length-1;i>=0;i--){
            arr[i]=temp%10;
            temp/=10;
        }
        int arr2[]=plusOne(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
