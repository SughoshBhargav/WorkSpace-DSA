import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EvenOddSort {
    public static void main(String[] args) {
        int nums[] = {2,1};
        sortArray(nums);
    }

    private static void sortArray(int[] nums) {


        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                evenList.add(nums[i]);
            }
            else{
                oddList.add(nums[i]);
            }
        }

        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());   

        System.out.println(evenList.toString());
        System.out.println(oddList.toString());


        
        int evenIndex = 0;
        int oddIndex = 0;

        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i] = evenList.get(evenIndex++);
            }
            else{
                nums[i] = oddList.get(oddIndex++);
            }
        }

        System.out.println(Arrays.toString(nums));

    }

}
