import java.util.Arrays;

public class GCD {
    public static void main(String[] args) {
        int nums[] = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }

    private static int findGCD(int[] nums) {
        
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();


        for(int i=max; i>=0; i--){
            if(max%i==0&&min%i==0){
                return i;
            }
        }
        
        
        
        return 1;
    }
}
