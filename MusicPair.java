public class MusicPair {
    public static void main(String[] args) {
        int time[] = {60,60,60};
        System.out.println(findResult(time));
    }

    private static int findResult(int[] time) {
    
        int result = 0;

        for(int i=0; i<time.length; i++){
            for(int j=i+1; j<time.length; j++){
                if((time[i]+time[j])%60==0){
                    result++;
                }
            }
        }
    
        return result;
    }
}
