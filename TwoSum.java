public class TwoSum {

    public static void main(String[] args) {
        
        int arr[] = ;
        int target = 0;
        int ans[] = twoSum(arr,target);
    }

    static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for(int i=0; i<nums.length; i++ ){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums [j] == target)
                {
                    ans[0] = i;
                    ans[1] =j;
                }
            }
        }
        return ans;
    }
}