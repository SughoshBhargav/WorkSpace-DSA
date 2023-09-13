import java.util.*;

public class highestAltitude {
    public static void main(String[] args) {
        int arr[] = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {

        int sum = 0;
        int max = 0;
        for(int i=0; i<gain.length; i++){
            sum += gain[i]; 
            if(max < sum)
                max = sum;
        }
        return max;
        
    }
}
