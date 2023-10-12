public class NicePairs {
    public static void main(String[] args) {
        int nums[] = {13,10,35,24,76};
        System.out.println(findNicePair(nums));
    }

    private static int findNicePair(int[] nums) {
        
        int count = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+rev(nums[j])==nums[j]+rev(nums[i])){
                    count++;
                }
            }
        }


        return count;
    }

    private static int rev(int i) {

        int revserdNum = 0;

        while(i!=0){
            int rem = i % 10;
            revserdNum = revserdNum*10 + rem;
            i = i/10;
        }
        return revserdNum;

    }
}
