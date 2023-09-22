import java.util.Arrays;

public class MakeArrayIncreasing {
    public static void main(String[] args) {
        int nums[] =  {1,5,2,4,1};
        makeIncreasing(nums);
    }

    private static void makeIncreasing(int[] nums) {
        
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]<=nums[i]){
                count += nums[i]-nums[i+1]+1;
                nums[i+1] += nums[i]-nums[i+1] + 1;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
    }

}
