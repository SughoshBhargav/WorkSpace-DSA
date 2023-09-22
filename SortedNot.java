public class SortedNot {
    public static void main(String[] args) {
        
        int nums[] = {2,1,3,4};
        System.out.println(isSorted(nums));
    }

    private static boolean isSorted(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int rotationIndex = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                rotationIndex = i;
            }
        }

        for(int i=start; i<rotationIndex; i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        for(int i=rotationIndex+1; i<end; i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        

        System.out.println(rotationIndex);
        return true;
    }
}
