import java.util.Arrays;

public class MaximumGap{
    public static void main(String[] args) {
        int nums[] = {10};
        System.out.println(findmax(nums));
    }

    private static int findmax(int[] nums) {
        
        int res = 0;

        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]>nums[j]){
        //             swap(nums,i,j);
        //         }
        //     }
        // }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for(int i=1; i<nums.length; i++){

            int dif = nums[i-1] - nums[i]>0?nums[i-1] - nums[i]:nums[i] - nums[i-1];
            if(res<dif){
                res = dif;
            }
        }
        
        return res;
    }

    private static void swap(int[] nums, int i, int j) {
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    
    }
}