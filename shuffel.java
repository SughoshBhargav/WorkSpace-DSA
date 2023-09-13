import java.util.*;
public class shuffel {


    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,7};
        shuffle(arr,3);
        
    }

    static void shuffle(int[] nums, int n) {

        int ans[] = new int[nums.length];
        int p1 = 0;
        int p2 = nums.length/2;
        for(int i=0; i<n; i++){
            ans[i] = nums[p1++];
            System.out.println(ans[i]);
            ans[i+1] = nums[p2++];
            System.out.println(ans[i+1]);
        }
        System.out.println(Arrays.toString(ans));
        
    }
    
}
