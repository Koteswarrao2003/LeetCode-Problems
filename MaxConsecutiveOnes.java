public class MaxConsecutiveOnes{
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,1,0,0,1};
        MaxConsecutiveOnes mc=new MaxConsecutiveOnes();
        int count=mc.findMaxConsecutiveOnes(arr);
        System.out.println("Count is: "+count);

    }

     public int findMaxConsecutiveOnes(int[] nums) {

        int count=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count=count+1;
                if(count>temp)
                    temp=count;
            }else{
                count=0;
            }
            
        }

        return temp;
    } 
}
