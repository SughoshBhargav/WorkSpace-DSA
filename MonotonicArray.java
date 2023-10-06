public class MonotonicArray {
    public static void main(String[] args) {
        int nums[] = {1,3,2};
        System.out.println(isMonotonic(nums));
    }

    private static boolean isMonotonic(int[] nums) {
        
        boolean decreasing = false;
        boolean increasing = false;

        if()

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<=nums[i+1]){
                increasing = true;
            }
            else{
                increasing = false;
                break;
            }
        }

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1]){
                decreasing = true;
            }
            else{
                decreasing = false;
                break;
            }

        }

        if(decreasing||increasing){
            return true;
        }
        
        
        
        return false;
    }
}
