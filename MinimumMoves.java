/*
Given an integer numsay nums of size n, return the minimum number of moves required to make all numsay elements equal.

In one move, you can increment or decrement an element of the numsay by 1.

Test cases are designed so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [1,2,3]
Output: 2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]
Example 2:

Input: nums = [1,10,2,9]
Output: 16
 
 
 
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumMoves{
    public static void main(String[] args) {
        int nums[] = {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143};
        finMinimumMoves(nums);
    }

    private static void finMinimumMoves(int[] nums) {

        int count = 0;
        int MinCount = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            int tempArr[] = Arrays.copyOfRange(nums, 0, nums.length);


            for(int j=0; j<nums.length; j++){
                if(j==i){
                    continue;
                }
                else{
                    count += nums[j] - temp>0?nums[j] - temp:temp - nums[j];
                }
            }

            if(count<MinCount){
                MinCount = count;
            }
            count = 0;
        }
        System.out.println(MinCount);
    }
}