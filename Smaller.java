import java.util.*;

public class Smaller {
    
    public static void main(String[] args) {
        int  arr[] = {8,1,2,2,3};
        int array[] = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(array));
    }
    
    static int[] smallerNumbersThanCurrent(int[] nums) {
        

        int ansArray[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                int r1 = nums[i];
                int r2 = nums[j];
                if(nums[i]>nums[j])




                
                    count++;
            }
            ansArray[i] = count;
        }
        return ansArray;
    }
}
