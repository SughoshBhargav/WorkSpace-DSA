public class LongestTask {
    public static void main(String[] args) {
        
        int arr[][] = {{0,3},{2,5},{0,9},{1,15}};
        System.out.println(findMax(arr));

    }

    private static int findMax(int[][] arr) {
        
        int minId = Integer.MAX_VALUE;
        int curTime = 0;
        int prevTime = 0;
        int maxTime = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<2; j++){
                curTime = arr[i][1];
                
                if( curTime - prevTime > maxTime){
                    maxTime = curTime - prevTime;
                    minId = arr[i][0];
                }

                if( curTime - prevTime == maxTime){
                    maxTime = curTime - prevTime;
                    if(arr[i][0] < minId){
                        minId = arr[i][0];
                    }
                }

            }
            prevTime = curTime;
        }

        
        return minId;

    }
}
